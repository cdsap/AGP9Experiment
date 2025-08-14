plugins {
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.ksp) apply false
    alias(libs.plugins.hilt) apply false
    id("com.autonomousapps.dependency-analysis") version "2.19.0" apply true
    id("io.github.cdsap.kotlinprocess") version "0.2.0"
    id("io.github.cdsap.gradleprocess") version "0.2.0"
    id("io.github.cdsap.gcreport") version "0.1.0"
}
gcReport {
    logs = listOf("gradle_gc.log", "kotlin_gc.log")
}