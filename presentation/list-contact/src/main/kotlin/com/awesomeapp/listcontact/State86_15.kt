package com.awesomeapp.listcontact

sealed class State86_15 {
    data object Loading : State86_15()
    data class Success(val data: String) : State86_15()
    data class Error(val message: String) : State86_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}