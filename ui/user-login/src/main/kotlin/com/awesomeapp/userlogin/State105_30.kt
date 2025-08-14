package com.awesomeapp.userlogin

sealed class State105_30 {
    data object Loading : State105_30()
    data class Success(val data: String) : State105_30()
    data class Error(val message: String) : State105_30()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}