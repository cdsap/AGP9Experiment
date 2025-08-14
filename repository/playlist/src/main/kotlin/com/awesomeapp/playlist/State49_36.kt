package com.awesomeapp.playlist

sealed class State49_36 {
    data object Loading : State49_36()
    data class Success(val data: String) : State49_36()
    data class Error(val message: String) : State49_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}