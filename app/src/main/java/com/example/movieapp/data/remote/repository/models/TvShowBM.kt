package com.example.movieapp.data.remote.repository.models

import com.example.movieapp.core.BusinessModel


data class TvShowBM(
    val results: List<TvResult>
): BusinessModel

data class TvResult(
    val adult: Boolean,
    val backdrop_path: String,
    val first_air_date: String,
    val genre_ids: List<Int> = emptyList(),
    val id: Int,
    val name: String,
    val origin_country: List<String> = emptyList(),
    val original_language: String,
    val original_name: String,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val vote_average: Double,
    val vote_count: Int
): BusinessModel