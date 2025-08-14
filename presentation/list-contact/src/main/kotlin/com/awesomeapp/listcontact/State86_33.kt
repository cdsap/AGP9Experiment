package com.awesomeapp.listcontact

sealed class State86_33 {
    data object Loading : State86_33()
    data class Success(val data: String) : State86_33()
    data class Error(val message: String) : State86_33()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}