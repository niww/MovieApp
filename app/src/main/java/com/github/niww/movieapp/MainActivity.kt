package com.github.niww.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.niww.movieapp.fragment.FragmentClickListener
import com.github.niww.movieapp.fragment.MovieDetailsFragment
import com.github.niww.movieapp.fragment.MovieListFragment

class MainActivity : AppCompatActivity(), FragmentClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.framelayout, MovieListFragment())
            .commit()

    }

    override fun ClickOnItem() {
        supportFragmentManager.beginTransaction()
            .add(R.id.framelayout, MovieDetailsFragment())
            .addToBackStack(null)
            .commit()
    }

}