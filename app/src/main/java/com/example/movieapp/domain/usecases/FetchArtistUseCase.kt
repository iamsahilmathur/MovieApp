package com.example.movieapp.domain.usecases

import com.example.movieapp.data.remote.repository.MovieRepository
import javax.inject.Inject

class FetchArtistUseCase @Inject constructor(private val movieRepository: MovieRepository) {
}