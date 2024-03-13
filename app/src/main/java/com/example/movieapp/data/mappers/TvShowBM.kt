package com.example.movieapp.data.mappers

import com.example.movieapp.core.RemoteToBusinessMapper
import com.example.movieapp.data.remote.repository.models.TvShowBM
import com.example.movieapp.data.remote.datasources.models.*
import com.example.movieapp.data.remote.repository.models.TvResult

class TvShowMapper : RemoteToBusinessMapper<TvShowsRM, TvShowBM> {
    override fun remoteModelToBusinessModel(model: TvShowsRM) = TvShowBM(
        results = model.results.map {
            TvResult(
                adult = it.adult,
                backdrop_path = it.backdrop_path,
                first_air_date = it.first_air_date,
                id = it.id,
                name = it.name,
                original_name = it.original_name,
                overview = it.overview,
                popularity = it.popularity,
                poster_path = it.poster_path,
                vote_average = it.vote_average,
                vote_count = it.vote_count,
                original_language = it.original_language
            )
        }
    )
}