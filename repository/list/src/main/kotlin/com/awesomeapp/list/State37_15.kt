package com.awesomeapp.list

sealed class State37_15 {
    data object Loading : State37_15()
    data class Success(val data: String) : State37_15()
    data class Error(val message: String) : State37_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}