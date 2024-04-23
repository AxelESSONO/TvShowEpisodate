package com.eseo.tvshowepisodate.most_popular.presentation

data class MostPopularState(
    val isLoading : Boolean = false,
    val tvShows : List<Any> = emptyList(),
    val error : String = ""
)