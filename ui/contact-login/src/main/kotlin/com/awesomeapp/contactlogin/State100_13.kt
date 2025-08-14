package com.awesomeapp.contactlogin

sealed class State100_13 {
    data object Loading : State100_13()
    data class Success(val data: String) : State100_13()
    data class Error(val message: String) : State100_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}