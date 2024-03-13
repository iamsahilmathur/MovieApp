package com.example.movieapp.data.remote.repository

import com.example.movieapp.core.DataResult
import com.example.movieapp.data.remote.repository.models.ArtistBM
import com.example.movieapp.data.remote.repository.models.MovieBM
import com.example.movieapp.data.remote.repository.models.TvShowBM

interface MovieRepository {
    suspend fun getPopularMovies(apiKey: String): DataResult<MovieBM>
    suspend fun getPopularTvShows(apiKey: String): DataResult<TvShowBM>
    suspend fun getPopularArtists(apiKey: String): DataResult<ArtistBM>
}