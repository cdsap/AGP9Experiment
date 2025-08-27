#!/usr/bin/env bash
set -euo pipefail

FILE="build-logic/convention/src/main/kotlin/com/logic/CompositeBuildPluginAndroidLib.kt"
CLASS_NAME="CompositeBuildPluginAndroidLib"
ITERATIONS=6

die() { echo "ERROR: $*" >&2; exit 1; }

check_file() {
  [[ -f "$FILE" ]] || die "File not found: $FILE"
  grep -q "$CLASS_NAME" "$FILE" || die "Class '$CLASS_NAME' not found in $FILE"
}

# Strategy 1: last line whose first non-space char is a '}' (top-level close)
top_level_close_line() {
  awk '
    /^[[:space:]]*}/ {
      # record indentation width
      match($0, /^[[:space:]]*/)
      indent = RLENGTH
      # prefer ZERO indentation (column-0) closes
      if (indent == 0) last_col0 = NR
      last_any = NR
    }
    END {
      if (last_col0) print last_col0
      else if (last_any) print last_any
      else print 0
    }
  ' "$FILE"
}

# Strategy 2 (fallback): find class close via brace depth from class header
class_close_line_fallback() {
  local start_line
  start_line="$(grep -n "$CLASS_NAME" "$FILE" | head -n1 | cut -d: -f1)"
  [[ -n "${start_line:-}" ]] || echo 0

  awk -v start="$start_line" '
    function is_escaped(line, idx,   b,esc){esc=0; for(b=idx-1;b>=1 && substr(line,b,1)=="\\";b--) esc++; return esc%2}
    NR < start { next }
    {
      line=$0
      # find class opening '{' first (ignore strings and // comments)
      if (!seen_open) {
        in_str=0
        for (i=1; i<=length(line); i++) {
          ch=substr(line,i,1); nxt=(i<length(line)?substr(line,i+1,1):"")
          if (!in_str && ch=="/" && nxt=="/") break
          if (ch=="\"" && !is_escaped(line,i)) { in_str=!in_str; continue }
          if (!in_str && ch=="{") { depth=1; seen_open=1; i++; break }
        }
        if (!seen_open) next
      }
      in_str2=0
      for (; i<=length(line); i++) {
        ch=substr(line,i,1); nxt=(i<length(line)?substr(line,i+1,1):"")
        if (!in_str2 && ch=="/" && nxt=="//") break
        if (ch=="\"" && !is_escaped(line,i)) { in_str2=!in_str2; continue }
        if (!in_str2) {
          if (ch=="{") depth++
          else if (ch=="}") {
            depth--
            if (depth==0) { print NR; exit }
          }
        }
      }
    }
    END { if (depth!=0) print 0 }
  ' "$FILE"
}

insertion_line() {
  local ln
  ln="$(top_level_close_line)"
  if [[ "$ln" -gt 0 ]]; then
    echo "$ln"
    return
  fi
  ln="$(class_close_line_fallback)"
  echo "$ln"
}

add_private_function() {
  local i="$1" ts func_name close_line tmpfile
  ts="$(date -u +'%Y-%m-%dT%H:%M:%SZ')"
  func_name="nonAbiBump_${i}"

  close_line="$(insertion_line)"
  [[ "$close_line" -gt 0 ]] || die "Could not find a safe insertion point in $FILE"

  # Skip if already present
  if grep -qE "^[[:space:]]*private[[:space:]]+fun[[:space:]]+$func_name\\(" "$FILE"; then
    echo "Function '$func_name' already exists; skipping."
    return 0
  fi

  # Ensure a blank line before our function for readability
  read -r -d '' FUNC <<EOF || true

    @Suppress("unused")
    private fun $func_name(): Int {
        // auto-generated non-ABI function for iteration $i at $ts
        return $i
    }
EOF

  tmpfile="$(mktemp)"
  {
    head -n $((close_line-1)) "$FILE"
    printf "%s\n" "$FUNC"
    tail -n +"$close_line" "$FILE"
  } > "$tmpfile"

  mv "$tmpfile" "$FILE"
  echo "Inserted '$func_name' before line $close_line (top-level class close)."
}

run_build() {
  local tag="$1"
  echo ">>> $(date -u +%FT%TZ) Running assembleDebug"
  ./gradlew assembleDebug "-Dscan.tag.${tag}=true"
}

# === Main ===
check_file
for ((i=1; i<=ITERATIONS; i++)); do
  echo "===== CYCLE $i ====="
  run_build "iteration_${i}"
  echo ">>> Adding private function to $CLASS_NAME"
  add_private_function "$i"
done

echo "===== FINAL BUILD ====="
run_build "final"
echo "Done."
