package com.example.movieapp.core

sealed class DataResult<out R> {
    class Success<out T>(val data: T) : DataResult<T>()
    class Error(val errorBody: Exception) : DataResult<Nothing>()
}
