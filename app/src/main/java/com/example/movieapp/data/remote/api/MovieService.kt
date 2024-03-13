package com.example.movieapp.data.remote.api

import com.example.movieapp.data.remote.datasources.models.ArtistRM
import com.example.movieapp.data.remote.datasources.models.MovieRM
import com.example.movieapp.data.remote.datasources.models.TvShows
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {

    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("api_key") apiKey: String): Response<MovieRM>

    @GET("tv/popular")
    suspend fun getPopularTvShows(@Query("api_key") apiKey: String): Response<TvShows>

    @GET("person/popular")
    suspend fun getPopularArtists(@Query("api_key") apiKey: String): Response<ArtistRM>
}