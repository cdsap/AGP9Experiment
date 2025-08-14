package com.awesomeapp.todocontact

sealed class State85_14 {
    data object Loading : State85_14()
    data class Success(val data: String) : State85_14()
    data class Error(val message: String) : State85_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}