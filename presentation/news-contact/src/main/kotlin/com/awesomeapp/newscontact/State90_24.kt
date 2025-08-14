package com.awesomeapp.newscontact

sealed class State90_24 {
    data object Loading : State90_24()
    data class Success(val data: String) : State90_24()
    data class Error(val message: String) : State90_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}