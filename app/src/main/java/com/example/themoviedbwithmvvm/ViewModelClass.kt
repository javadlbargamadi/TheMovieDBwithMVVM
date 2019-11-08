package com.example.themoviedbwithmvvm

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.themoviedbwithmvvm.MovieListClass.MovieListClass
import io.reactivex.Observable

class ViewModelClass : ViewModel() {

    private val model = ModelClass()
    private val liveData = MutableLiveData<MovieListClass>()

    fun getMoviesList(title: String) {
        model.getMoviesContain(title)
            .subscribe({
                liveData.value = it
            }, {
                Log.e("e", "")
            })
    }

    fun getLiveData(): LiveData<MovieListClass> = liveData


//    retrofit.create(RetrofitInterface::class.java)
//    .getMovieList(movieName)
//    .subscribeOn(Schedulers.io())
//    .observeOn(AndroidSchedulers.mainThread())
//    .subscribe({
//        tmDbPresenter.onMovieListReceived(it.results as ArrayList<Result>)
//    }, {
//        Log.d("MYTAG", it.message)
//    })

//    retrofit.create(RetrofitInterface::class.java)
//    .getMovieList(movieName)
//    .subscribeOn(Schedulers.io())
//    .observeOn(AndroidSchedulers.mainThread())
//    .subscribe({
//        tmDbPresenter.onMovieListReceived(it.results as ArrayList<Result>)
//    }, {
//        Log.d("MYTAG", it.message)
//    })

}