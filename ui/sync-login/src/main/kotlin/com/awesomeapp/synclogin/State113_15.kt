package com.awesomeapp.synclogin

sealed class State113_15 {
    data object Loading : State113_15()
    data class Success(val data: String) : State113_15()
    data class Error(val message: String) : State113_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}