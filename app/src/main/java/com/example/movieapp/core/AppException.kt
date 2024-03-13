package com.example.movieapp.core

class AppException(private val code : Int = 0, private val msg: String) : Exception(message = msg)