package com.eseo.tvshowepisodate.most_popular.presentation

import androidx.lifecycle.ViewModel
import com.eseo.tvshowepisodate.most_popular.domain.use_case.MostPopularUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MostPopularViewModel @Inject constructor(
    private val mostPopularUseCase: MostPopularUseCase
) : ViewModel() {

    fun getMostPopular(){

        mostPopularUseCase(page = 18)

    }


    /*private val _tvShowState: MutableStateFlow<MostPopularState> = MutableStateFlow(MostPopularState())
    var tvShowState: StateFlow<MostPopularState> = _tvShowState*/

  /*  fun getMostPopularTvShows(page : Int)
    = viewModelScope.launch(Dispatchers.IO) {
        mostPopularUseCase(page).collectLatest { resource ->

            when(resource){
                is Resource.Error -> {
                    _tvShowState.value = MostPopularState(error = "Unexpected error occurred")
                }
                is Resource.Loading -> {
                    _tvShowState.value = MostPopularState(isLoading = true)
                }
                is Resource.Success -> {
                    _tvShowState.value = MostPopularState(
                        tvShows = resource.data?: emptyList()
                    )
                }
            }
        }
    }*/


}