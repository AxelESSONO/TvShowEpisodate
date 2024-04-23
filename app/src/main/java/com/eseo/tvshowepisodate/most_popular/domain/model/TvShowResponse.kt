package com.eseo.tvshowepisodate.most_popular.domain.model

import com.eseo.tvshowepisodate.most_popular.data.remote.dto.TvShowDto

data class TvShowResponse(
    val page: Int,
    val pages: Int,
    val total: String,
    val tvShows: List<TvShowDto>
)
