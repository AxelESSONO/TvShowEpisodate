package com.eseo.tvshowepisodate.most_popular.di

import com.eseo.tvshowepisodate.most_popular.data.remote.api.TvShowApi
import com.eseo.tvshowepisodate.most_popular.data.remote.repository.TvShowRepositoryImpl
import com.eseo.tvshowepisodate.most_popular.domain.repository.TvShowRepository
import com.eseo.tvshowepisodate.most_popular.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideTvShowApi() : TvShowApi{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .build()
            .create(TvShowApi::class.java)
    }

    @Singleton
    @Provides
    fun provideTvShowRepository( tvShowApi: TvShowApi) : TvShowRepository{
        return TvShowRepositoryImpl(tvShowApi)
    }

}