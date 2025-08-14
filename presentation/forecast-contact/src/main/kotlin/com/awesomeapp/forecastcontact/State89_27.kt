package com.awesomeapp.forecastcontact

sealed class State89_27 {
    data object Loading : State89_27()
    data class Success(val data: String) : State89_27()
    data class Error(val message: String) : State89_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}