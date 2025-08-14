package com.awesomeapp.settinglogin

sealed class State118_18 {
    data object Loading : State118_18()
    data class Success(val data: String) : State118_18()
    data class Error(val message: String) : State118_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}