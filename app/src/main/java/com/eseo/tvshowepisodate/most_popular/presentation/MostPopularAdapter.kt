package com.eseo.tvshowepisodate.most_popular.presentation

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.eseo.tvshowepisodate.R
import com.eseo.tvshowepisodate.most_popular.domain.model.TvShow

class MostPopularAdapter: RecyclerView.Adapter<MostPopularAdapter.MostPopularViewHolder>() {

    private var tvShowList : MutableList<TvShow> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MostPopularViewHolder {
        val viewRoot : View = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.tv_show, parent, false)
        return MostPopularViewHolder(viewRoot)
    }

    override fun onBindViewHolder(holder: MostPopularViewHolder, position: Int) {
        holder.bindTvShow(tvShowList[position])
    }

    override fun getItemCount(): Int = tvShowList.size

    @SuppressLint("NotifyDataSetChanged")
    fun loadData(tvShows: List<TvShow>){
        this.tvShowList = tvShows.toMutableList()
        notifyDataSetChanged()
    }

    class MostPopularViewHolder(
        private val view : View
    ) : RecyclerView.ViewHolder(view) {

        val imageTvShow : ImageView = view.findViewById(R.id.tvShowImage)
        val tvShowName : TextView = view.findViewById(R.id.tvShowNameText)

        fun bindTvShow(tvShow: TvShow){

            tvShowName.text = tvShow.name

            Glide.with(view.context)
                .load(tvShow.imageUrl)
                .into(imageTvShow)
        }
    }
}