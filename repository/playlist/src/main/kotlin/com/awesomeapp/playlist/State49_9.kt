package com.awesomeapp.playlist

sealed class State49_9 {
    data object Loading : State49_9()
    data class Success(val data: String) : State49_9()
    data class Error(val message: String) : State49_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}