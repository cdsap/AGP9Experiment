package com.awesomeapp.cartlogin

sealed class State104_14 {
    data object Loading : State104_14()
    data class Success(val data: String) : State104_14()
    data class Error(val message: String) : State104_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}