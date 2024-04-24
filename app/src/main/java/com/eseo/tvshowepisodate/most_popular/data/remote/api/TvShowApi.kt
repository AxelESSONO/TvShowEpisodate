package com.eseo.tvshowepisodate.most_popular.data.remote.api

import com.eseo.tvshowepisodate.most_popular.data.remote.dto.TvShowResponseDto
import com.eseo.tvshowepisodate.most_popular.util.Constants
import retrofit2.http.GET
import retrofit2.http.Query

interface TvShowApi {

    @GET(Constants.MOST_POPULAR_END_POINT)
    suspend fun getTvShowResponse(
        @Query("page")
        page: Int,
    ): TvShowResponseDto

    // show-details
    // https://www.episodate.com/api/show-details?q=arrow
    @GET("show-details")
    suspend fun getTvShowDetails(
        @Query("q")
        id : Int
    )

}