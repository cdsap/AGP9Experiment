package com.awesomeapp.log

sealed class State25_32 {
    data object Loading : State25_32()
    data class Success(val data: String) : State25_32()
    data class Error(val message: String) : State25_32()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}