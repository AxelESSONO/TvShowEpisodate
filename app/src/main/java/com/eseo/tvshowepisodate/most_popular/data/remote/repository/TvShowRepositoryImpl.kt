package com.eseo.tvshowepisodate.most_popular.data.remote.repository

import com.eseo.tvshowepisodate.most_popular.data.remote.api.TvShowApi
import com.eseo.tvshowepisodate.most_popular.data.remote.dto.TvShowResponseDto
import com.eseo.tvshowepisodate.most_popular.domain.repository.TvShowRepository

class TvShowRepositoryImpl(private val tvShowApi: TvShowApi) : TvShowRepository {
    override suspend fun getTvShowResponse(page: Int): TvShowResponseDto {
        return tvShowApi.getTvShowResponse(page)
    }
}