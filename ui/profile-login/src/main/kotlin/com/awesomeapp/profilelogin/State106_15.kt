package com.awesomeapp.profilelogin

sealed class State106_15 {
    data object Loading : State106_15()
    data class Success(val data: String) : State106_15()
    data class Error(val message: String) : State106_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}