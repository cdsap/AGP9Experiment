package com.awesomeapp.filecontact

sealed class State82_21 {
    data object Loading : State82_21()
    data class Success(val data: String) : State82_21()
    data class Error(val message: String) : State82_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}