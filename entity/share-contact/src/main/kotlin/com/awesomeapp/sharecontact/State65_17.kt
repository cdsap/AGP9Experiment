package com.awesomeapp.sharecontact

sealed class State65_17 {
    data object Loading : State65_17()
    data class Success(val data: String) : State65_17()
    data class Error(val message: String) : State65_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}