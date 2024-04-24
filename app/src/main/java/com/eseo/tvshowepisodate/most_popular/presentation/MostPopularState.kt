package com.eseo.tvshowepisodate.most_popular.presentation

import com.eseo.tvshowepisodate.most_popular.domain.model.TvShow

data class MostPopularState(
    val isLoading : Boolean = false,
    val tvShows : List<TvShow> = emptyList(),
    val error : String = ""
)