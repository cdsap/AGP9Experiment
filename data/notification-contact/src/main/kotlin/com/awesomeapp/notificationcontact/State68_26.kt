package com.awesomeapp.notificationcontact

sealed class State68_26 {
    data object Loading : State68_26()
    data class Success(val data: String) : State68_26()
    data class Error(val message: String) : State68_26()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}