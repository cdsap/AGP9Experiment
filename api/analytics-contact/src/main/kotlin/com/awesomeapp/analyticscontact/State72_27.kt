package com.awesomeapp.analyticscontact

sealed class State72_27 {
    data object Loading : State72_27()
    data class Success(val data: String) : State72_27()
    data class Error(val message: String) : State72_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}