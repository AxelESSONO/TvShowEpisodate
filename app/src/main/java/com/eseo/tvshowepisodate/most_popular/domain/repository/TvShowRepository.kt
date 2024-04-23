package com.eseo.tvshowepisodate.most_popular.domain.repository

import com.eseo.tvshowepisodate.most_popular.data.remote.dto.TvShowResponseDto
import retrofit2.http.Query

interface TvShowRepository {

    suspend fun getTvShowResponse(page: Int): TvShowResponseDto

}