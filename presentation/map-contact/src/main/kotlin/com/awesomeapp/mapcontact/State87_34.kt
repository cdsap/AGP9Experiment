package com.awesomeapp.mapcontact

sealed class State87_34 {
    data object Loading : State87_34()
    data class Success(val data: String) : State87_34()
    data class Error(val message: String) : State87_34()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}