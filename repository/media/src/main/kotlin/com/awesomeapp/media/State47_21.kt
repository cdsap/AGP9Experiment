package com.awesomeapp.media

sealed class State47_21 {
    data object Loading : State47_21()
    data class Success(val data: String) : State47_21()
    data class Error(val message: String) : State47_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}