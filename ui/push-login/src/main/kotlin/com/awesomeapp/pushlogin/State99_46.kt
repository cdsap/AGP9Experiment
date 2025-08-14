package com.awesomeapp.pushlogin

sealed class State99_46 {
    data object Loading : State99_46()
    data class Success(val data: String) : State99_46()
    data class Error(val message: String) : State99_46()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}