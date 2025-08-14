package com.awesomeapp.synclogin

sealed class State113_36 {
    data object Loading : State113_36()
    data class Success(val data: String) : State113_36()
    data class Error(val message: String) : State113_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}