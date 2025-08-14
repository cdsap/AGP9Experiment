package com.awesomeapp.messagelogin

sealed class State116_23 {
    data object Loading : State116_23()
    data class Success(val data: String) : State116_23()
    data class Error(val message: String) : State116_23()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}