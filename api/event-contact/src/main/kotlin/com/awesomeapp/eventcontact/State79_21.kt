package com.awesomeapp.eventcontact

sealed class State79_21 {
    data object Loading : State79_21()
    data class Success(val data: String) : State79_21()
    data class Error(val message: String) : State79_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}