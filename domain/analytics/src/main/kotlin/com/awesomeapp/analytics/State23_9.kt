package com.awesomeapp.analytics

sealed class State23_9 {
    data object Loading : State23_9()
    data class Success(val data: String) : State23_9()
    data class Error(val message: String) : State23_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}