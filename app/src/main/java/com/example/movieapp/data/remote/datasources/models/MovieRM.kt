package com.example.movieapp.data.remote.datasources.models

import com.example.movieapp.core.RemoteModel
import com.google.gson.annotations.SerializedName

data class MovieRM(
    val page: Int,
    @SerializedName("results")
    val results: List<MovieResult>,
    val total_pages: Int,
    val total_results: Int
) : RemoteModel

data class MovieResult(
    val adult: Boolean,
    val backdrop_path: String,
    val genre_ids: List<Int>,
    val id: Int,
    val original_language: String,
    val original_title: String,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val video: Boolean,
    val vote_average: Double,
    val vote_count: Int
) : RemoteModel