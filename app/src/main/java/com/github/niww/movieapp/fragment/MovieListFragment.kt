package com.github.niww.movieapp.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.niww.movieapp.R
import com.github.niww.movieapp.data.MovieList

class MovieListFragment: Fragment() {

    private var fragmentClickListener: FragmentClickListener? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_movie_list,container,false)
//        view.findViewById<ConstraintLayout>(R.id.card_m1).setOnClickListener {
//            fragmentClickListener?.ClickOnItem()
//        }

        val movieList = mutableListOf<MovieList>(
            MovieList("1","2"),
            MovieList("2","2"),
            MovieList("3","2"),
            MovieList("4","2"),
            MovieList("5","2"),
            MovieList("6","2")
        )

        val rv = view.findViewById<RecyclerView>(R.id.rv_movie)
        val movieAdapter = MovieItemAdapter()
        movieAdapter.listMovie = movieList
        val gridlayoutManager = GridLayoutManager(this.context,2,LinearLayoutManager.VERTICAL,false)

        rv.apply {
            adapter = movieAdapter
            layoutManager = gridlayoutManager
        }

        return  view


    }



    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is FragmentClickListener){
            fragmentClickListener = context
        }
    }

    override fun onDetach() {
        super.onDetach()
        fragmentClickListener = null
    }


}