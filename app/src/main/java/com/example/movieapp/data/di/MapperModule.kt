package com.example.movieapp.data.di

import com.example.movieapp.data.mappers.ArtistMapper
import com.example.movieapp.data.mappers.MovieMapper
import com.example.movieapp.data.mappers.TvShowMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object MapperModule {

    @Provides
    fun provideArtistMapper() = ArtistMapper()

    @Provides
    fun provideMovieMapper() = MovieMapper()

    @Provides
    fun provideTvShowMapper() = TvShowMapper()
}