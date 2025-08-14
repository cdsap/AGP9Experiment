package com.awesomeapp.mediacontact

sealed class State96_12 {
    data object Loading : State96_12()
    data class Success(val data: String) : State96_12()
    data class Error(val message: String) : State96_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}