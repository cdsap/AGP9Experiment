package com.awesomeapp.document

sealed class State34_12 {
    data object Loading : State34_12()
    data class Success(val data: String) : State34_12()
    data class Error(val message: String) : State34_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}