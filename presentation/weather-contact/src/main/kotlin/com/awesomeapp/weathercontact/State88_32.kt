package com.awesomeapp.weathercontact

sealed class State88_32 {
    data object Loading : State88_32()
    data class Success(val data: String) : State88_32()
    data class Error(val message: String) : State88_32()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}