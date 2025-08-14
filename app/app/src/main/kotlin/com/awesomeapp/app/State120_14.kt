package com.awesomeapp.app

sealed class State120_14 {
    data object Loading : State120_14()
    data class Success(val data: String) : State120_14()
    data class Error(val message: String) : State120_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}