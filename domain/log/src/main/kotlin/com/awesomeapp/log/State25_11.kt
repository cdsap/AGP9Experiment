package com.awesomeapp.log

sealed class State25_11 {
    data object Loading : State25_11()
    data class Success(val data: String) : State25_11()
    data class Error(val message: String) : State25_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}