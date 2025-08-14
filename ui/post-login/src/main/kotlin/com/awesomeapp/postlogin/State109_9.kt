package com.awesomeapp.postlogin

sealed class State109_9 {
    data object Loading : State109_9()
    data class Success(val data: String) : State109_9()
    data class Error(val message: String) : State109_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}