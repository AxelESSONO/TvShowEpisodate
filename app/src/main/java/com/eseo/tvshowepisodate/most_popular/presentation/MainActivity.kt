package com.eseo.tvshowepisodate.most_popular.presentation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.eseo.tvshowepisodate.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {

    private var page: Int = 1
    private val mostPopularViewModel : MostPopularViewModel by viewModels()

    //private lateinit var recyclerTvShow : RecyclerView
    //private lateinit var mostPopularAdapter : MostPopularAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //setRecyclerView()



        /*CoroutineScope(Dispatchers.IO).launch {
            mostPopularViewModel.getMostPopularTvShows(page)
            mostPopularViewModel.tvShowState.collectLatest { mostPopularState ->
                withContext(Dispatchers.Main){
                    mostPopularAdapter.loadData(mostPopularState.tvShows)
                }
            }
        }*/

    }

  /*  private fun setRecyclerView() {
        mostPopularAdapter = MostPopularAdapter()
        recyclerTvShow = findViewById(R.id.tvShowRecycler)
        recyclerTvShow.adapter = mostPopularAdapter
        recyclerTvShow.layoutManager = GridLayoutManager(applicationContext, 2)
    }*/
}