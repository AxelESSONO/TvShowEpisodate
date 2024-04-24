package com.eseo.tvshowepisodate.most_popular.domain.use_case

import com.eseo.tvshowepisodate.most_popular.data.remote.dto.toTvShow
import com.eseo.tvshowepisodate.most_popular.domain.model.TvShow
import com.eseo.tvshowepisodate.most_popular.domain.repository.TvShowRepository
import com.eseo.tvshowepisodate.most_popular.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class MostPopularUseCase @Inject constructor(
    private val repository: TvShowRepository
) {

    operator fun invoke(page : Int) : Flow<Resource<List<TvShow>>> = flow {

        try {
            emit(Resource.Loading<List<TvShow>>(isLoading = true))
            val tvShows : List<TvShow> = repository.getTvShowResponse(page)
                .tvShowDtos.map {
                    it.toTvShow()
                }

            emit(Resource.Success<List<TvShow>>(tvShows))
        }catch (e : IOException){
            emit(Resource.Error<List<TvShow>>(message = "${e.localizedMessage}"))
        }catch (e : HttpException){
            emit(Resource.Error<List<TvShow>>(message = "Internet Error"))
        }
    }

}