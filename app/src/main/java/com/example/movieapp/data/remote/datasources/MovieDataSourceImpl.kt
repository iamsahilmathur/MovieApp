package com.example.movieapp.data.remote.datasources

import com.example.movieapp.core.NetworkResponseHandler
import com.example.movieapp.data.remote.api.MovieService
import retrofit2.Retrofit

class MovieDataSourceImpl(private val movieService: MovieService, private val retrofit: Retrofit) :
    MovieDataSource, NetworkResponseHandler(retrofit) {

    override suspend fun getPopularMovies(apiKey: String) = safeApiCall {
        movieService.getPopularMovies(apiKey)
    }

    override suspend fun getPopularTvShows(apiKey: String) = safeApiCall {
        movieService.getPopularTvShows(apiKey)
    }

    override suspend fun getPopularArtists(apiKey: String) = safeApiCall {
        movieService.getPopularArtists(apiKey)
    }
}