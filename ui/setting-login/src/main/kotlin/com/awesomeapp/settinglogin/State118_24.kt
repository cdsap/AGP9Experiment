package com.awesomeapp.settinglogin

sealed class State118_24 {
    data object Loading : State118_24()
    data class Success(val data: String) : State118_24()
    data class Error(val message: String) : State118_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}