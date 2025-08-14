package com.awesomeapp.log

sealed class State25_20 {
    data object Loading : State25_20()
    data class Success(val data: String) : State25_20()
    data class Error(val message: String) : State25_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}