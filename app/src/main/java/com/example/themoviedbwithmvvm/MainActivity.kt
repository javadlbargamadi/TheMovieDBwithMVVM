package com.example.themoviedbwithmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.themoviedbwithmvvm.MovieListClass.Result
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModelClass: ViewModelClass
    private val searchResult = ArrayList<Result>()
    private lateinit var tmDbRecyclerAdapter: TMDbRecyclerAdapter

//--------------------------------------------------------------------------------------------------

    private fun setUpRecyclerView() {
        tmDbRecyclerAdapter = TMDbRecyclerAdapter(searchResult)
        recyclerView.adapter = tmDbRecyclerAdapter
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var userMovieName : String

        viewModelClass = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        ).get(ViewModelClass::class.java)

        setUpRecyclerView()

        btnSearch.setOnClickListener {
            userMovieName = edtUserMovie.text.toString()
            viewModelClass.getMoviesList(userMovieName)
            viewModelClass.getLiveData().observe(this, Observer {
                searchResult.clear()
                searchResult.addAll(it.results)
                tmDbRecyclerAdapter.notifyDataSetChanged()
            })
        }
    }
}
