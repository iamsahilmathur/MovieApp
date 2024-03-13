package com.example.movieapp.data.remote.datasources.models

import com.example.movieapp.core.RemoteModel
import com.google.gson.annotations.SerializedName

data class TvShowsRM(
    val page: Int,
    @SerializedName("results")
    val results: List<TvResult>,
    val total_pages: Int,
    val total_results: Int
) : RemoteModel

data class TvResult(
    val adult: Boolean,
    val backdrop_path: String,
    val first_air_date: String,
    val genre_ids: List<Int>,
    val id: Int,
    val name: String,
    val origin_country: List<String>,
    val original_language: String,
    val original_name: String,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val vote_average: Double,
    val vote_count: Int
) : RemoteModel