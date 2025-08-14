package com.awesomeapp.timercontact

sealed class State81_16 {
    data object Loading : State81_16()
    data class Success(val data: String) : State81_16()
    data class Error(val message: String) : State81_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}