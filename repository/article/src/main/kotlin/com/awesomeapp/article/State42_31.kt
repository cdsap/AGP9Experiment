package com.awesomeapp.article

sealed class State42_31 {
    data object Loading : State42_31()
    data class Success(val data: String) : State42_31()
    data class Error(val message: String) : State42_31()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}