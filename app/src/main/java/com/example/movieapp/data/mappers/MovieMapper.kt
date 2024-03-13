package com.example.movieapp.data.mappers

import com.example.movieapp.core.RemoteToBusinessMapper
import com.example.movieapp.data.remote.datasources.models.MovieRM
import com.example.movieapp.data.remote.repository.models.MovieBM
import com.example.movieapp.data.remote.repository.models.MovieResult

class MovieMapper : RemoteToBusinessMapper<MovieRM, MovieBM> {
    override fun remoteModelToBusinessModel(model: MovieRM) = MovieBM(
        results = model.results.map {
            MovieResult(
                adult = it.adult,
                backdrop_path = it.backdrop_path,
                id = it.id,
                original_language = it.original_language,
                original_title = it.original_title,
                overview = it.overview,
                popularity = it.popularity,
                poster_path = it.poster_path,
                release_date = it.release_date,
                title = it.title,
                video = it.video,
                vote_average = it.vote_average,
                vote_count = it.vote_count
            )
        }
    )
}