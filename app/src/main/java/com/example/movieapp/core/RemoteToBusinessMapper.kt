package com.example.movieapp.core

interface RemoteToBusinessMapper<RM,BM> {
    fun remoteModelToBusinessModel(model : RM) : BM
}