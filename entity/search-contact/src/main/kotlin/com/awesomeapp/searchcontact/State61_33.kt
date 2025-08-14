package com.awesomeapp.searchcontact

sealed class State61_33 {
    data object Loading : State61_33()
    data class Success(val data: String) : State61_33()
    data class Error(val message: String) : State61_33()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}