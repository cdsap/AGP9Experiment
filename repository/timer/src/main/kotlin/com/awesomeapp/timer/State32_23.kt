package com.awesomeapp.timer

sealed class State32_23 {
    data object Loading : State32_23()
    data class Success(val data: String) : State32_23()
    data class Error(val message: String) : State32_23()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}