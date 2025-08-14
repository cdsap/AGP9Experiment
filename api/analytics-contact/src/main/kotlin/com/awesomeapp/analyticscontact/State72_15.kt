package com.awesomeapp.analyticscontact

sealed class State72_15 {
    data object Loading : State72_15()
    data class Success(val data: String) : State72_15()
    data class Error(val message: String) : State72_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}