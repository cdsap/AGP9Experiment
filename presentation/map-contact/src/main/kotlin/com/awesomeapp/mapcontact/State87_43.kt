package com.awesomeapp.mapcontact

sealed class State87_43 {
    data object Loading : State87_43()
    data class Success(val data: String) : State87_43()
    data class Error(val message: String) : State87_43()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}