package com.awesomeapp.notificationcontact

sealed class State68_14 {
    data object Loading : State68_14()
    data class Success(val data: String) : State68_14()
    data class Error(val message: String) : State68_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}