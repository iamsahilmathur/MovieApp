package com.example.movieapp.data.remote.repository

import com.example.movieapp.core.DataResult
import com.example.movieapp.data.mappers.ArtistMapper
import com.example.movieapp.data.mappers.MovieMapper
import com.example.movieapp.data.mappers.TvShowMapper
import com.example.movieapp.data.remote.datasources.MovieDataSource

class MovieRepositoryImpl(
    private val movieDataSource: MovieDataSource,
    private val movieMapper: MovieMapper,
    private val artistMapper: ArtistMapper,
    private val tvShowMapper: TvShowMapper
) : MovieRepository {
    override suspend fun getPopularMovies(apiKey: String) =
        when (val response = movieDataSource.getPopularMovies(apiKey)) {
            is DataResult.Success -> DataResult.Success(
                movieMapper.remoteModelToBusinessModel(
                    response.data
                )
            )

            is DataResult.Error -> DataResult.Error(errorBody = response.errorBody)
        }

    override suspend fun getPopularTvShows(apiKey: String) = when (val response = movieDataSource.getPopularTvShows(apiKey)) {
        is DataResult.Success -> DataResult.Success(
            tvShowMapper.remoteModelToBusinessModel(
                response.data
            )
        )

        is DataResult.Error -> DataResult.Error(errorBody = response.errorBody)
    }

    override suspend fun getPopularArtists(apiKey: String) = when (val response = movieDataSource.getPopularArtists(apiKey)) {
        is DataResult.Success -> DataResult.Success(
            artistMapper.remoteModelToBusinessModel(
                response.data
            )
        )

        is DataResult.Error -> DataResult.Error(errorBody = response.errorBody)
    }
}