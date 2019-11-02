package com.example.themoviedbwithmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), RetrofitInterface {

    lateinit var viewModelClass: ViewModelClass
    lateinit var recyclerViewAdapter: TMDbRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModelClass = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        ).get(ViewModelClass::class.java)

        btnSearch.setOnClickListener { getMovieList(edtUserMovie.text.toString()) }


        viewModelClass.
    }
}
