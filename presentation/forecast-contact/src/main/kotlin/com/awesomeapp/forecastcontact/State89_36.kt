package com.awesomeapp.forecastcontact

sealed class State89_36 {
    data object Loading : State89_36()
    data class Success(val data: String) : State89_36()
    data class Error(val message: String) : State89_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}