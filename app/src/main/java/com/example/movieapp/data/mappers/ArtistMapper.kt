package com.example.movieapp.data.mappers

import com.example.movieapp.core.RemoteToBusinessMapper
import com.example.movieapp.data.remote.datasources.models.ArtistRM
import com.example.movieapp.data.remote.repository.models.ArtistBM
import com.example.movieapp.data.remote.repository.models.KnownFor
import com.example.movieapp.data.remote.repository.models.Result

class ArtistMapper : RemoteToBusinessMapper<ArtistRM, ArtistBM> {
    override fun remoteModelToBusinessModel(model: ArtistRM) = ArtistBM(
        results = model.results.map {
            Result(
                adult = it.adult,
                gender = it.gender,
                id = it.id,
                known_for = it.known_for.map { k ->
                    KnownFor(
                        adult = k.adult,
                        backdrop_path = k.backdrop_path,
                        first_air_date = k.first_air_date,
                        genre_ids = k.genre_ids,
                        id = k.id,
                        media_type = k.media_type,
                        name = k.name,
                        origin_country = k.origin_country,
                        original_language = k.original_language,
                        original_name = k.original_name,
                        original_title = k.original_title,
                        overview = k.overview,
                        popularity = k.popularity,
                        poster_path = k.poster_path,
                        release_date = k.release_date,
                        title = k.title,
                        video = k.video,
                        vote_average = k.vote_average,
                        vote_count = k.vote_count
                    )
                },
                known_for_department = it.known_for_department,
                name = it.name,
                original_name = it.original_name,
                popularity = it.popularity,
                profile_path = it.profile_path
            )
        }
    )
}