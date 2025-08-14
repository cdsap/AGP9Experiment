package com.awesomeapp.checkoutcontact

sealed class State54_13 {
    data object Loading : State54_13()
    data class Success(val data: String) : State54_13()
    data class Error(val message: String) : State54_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}