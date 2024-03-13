package com.example.movieapp.data.di

import com.example.movieapp.data.remote.api.MovieService
import com.example.movieapp.data.remote.datasources.MovieDataSource
import com.example.movieapp.data.remote.datasources.MovieDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
object MovieDataSourceModule {

    @Provides
    fun provideMovieDateSource(movieService: MovieService, retrofit: Retrofit): MovieDataSource =
        MovieDataSourceImpl(movieService, retrofit)
}