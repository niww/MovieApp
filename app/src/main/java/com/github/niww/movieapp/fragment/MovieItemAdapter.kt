package com.github.niww.movieapp.fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.github.niww.movieapp.R
import com.github.niww.movieapp.data.MovieList

class MovieItemAdapter : RecyclerView.Adapter<MovieItemAdapter.MovieViewHolder>() {

    var listMovie = mutableListOf<MovieList>()
        set(value) {
            field = value
        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MovieViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false))

    override fun onBindViewHolder(holderMovie: MovieViewHolder, position: Int) {
        holderMovie.bind(listMovie[position])
    }


    class MovieViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val img = view.findViewById<ImageView>(R.id.iv_preview)
        val tv = view.findViewById<TextView>(R.id.tv_preview)

        fun bind(movieList: MovieList) {
            tv.text = movieList.movieName
        }
    }


    override fun getItemCount(): Int = listMovie.size
}