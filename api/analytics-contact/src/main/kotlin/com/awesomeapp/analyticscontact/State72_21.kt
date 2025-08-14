package com.awesomeapp.analyticscontact

sealed class State72_21 {
    data object Loading : State72_21()
    data class Success(val data: String) : State72_21()
    data class Error(val message: String) : State72_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}