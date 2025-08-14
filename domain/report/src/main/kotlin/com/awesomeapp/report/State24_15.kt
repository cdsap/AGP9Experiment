package com.awesomeapp.report

sealed class State24_15 {
    data object Loading : State24_15()
    data class Success(val data: String) : State24_15()
    data class Error(val message: String) : State24_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}