package com.awesomeapp.timercontact

sealed class State81_31 {
    data object Loading : State81_31()
    data class Success(val data: String) : State81_31()
    data class Error(val message: String) : State81_31()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}