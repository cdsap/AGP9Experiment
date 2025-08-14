package com.awesomeapp.timer

sealed class State32_35 {
    data object Loading : State32_35()
    data class Success(val data: String) : State32_35()
    data class Error(val message: String) : State32_35()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}