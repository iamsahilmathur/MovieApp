package com.example.movieapp.data.remote.datasources

import com.example.movieapp.core.DataResult
import com.example.movieapp.data.remote.datasources.models.ArtistRM
import com.example.movieapp.data.remote.datasources.models.MovieRM
import com.example.movieapp.data.remote.datasources.models.TvShowsRM


interface MovieDataSource {
    suspend fun getPopularMovies(apiKey: String): DataResult<MovieRM>
    suspend fun getPopularTvShows(apiKey: String): DataResult<TvShowsRM>
    suspend fun getPopularArtists(apiKey: String): DataResult<ArtistRM>
}