package com.awesomeapp.documentcontact

sealed class State83_24 {
    data object Loading : State83_24()
    data class Success(val data: String) : State83_24()
    data class Error(val message: String) : State83_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}