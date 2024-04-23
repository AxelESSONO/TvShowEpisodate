package com.eseo.tvshowepisodate.most_popular.data.remote.dto


import com.eseo.tvshowepisodate.most_popular.domain.model.TvShowResponse
import com.google.gson.annotations.SerializedName

data class TvShowResponseDto(
    @SerializedName("page")
    val page: Int,
    @SerializedName("pages")
    val pages: Int,
    @SerializedName("total")
    val total: String,
    @SerializedName("tv_shows")
    val tvShowDtos: List<TvShowDto>
)

fun TvShowResponseDto.toTvShowResponse() : TvShowResponse{
    return TvShowResponse(
        page = page,
        pages = pages,
        total = total,
        tvShows = tvShowDtos
    )
}