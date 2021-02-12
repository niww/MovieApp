package com.github.niww.movieapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.bottom).setOnClickListener {
            val intent = Intent(this, MovieDetailsActivity::class.java)
            intent.putExtra("Test", 1)
            startActivity(intent)
        }

    }
}