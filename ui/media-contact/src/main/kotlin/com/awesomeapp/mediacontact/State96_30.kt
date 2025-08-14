package com.awesomeapp.mediacontact

sealed class State96_30 {
    data object Loading : State96_30()
    data class Success(val data: String) : State96_30()
    data class Error(val message: String) : State96_30()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}