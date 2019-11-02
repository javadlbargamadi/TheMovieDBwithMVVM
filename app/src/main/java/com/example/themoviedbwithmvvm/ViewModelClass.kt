package com.example.themoviedbwithmvvm

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.themoviedbwithmvvm.MovieListClass.MovieListClass
import io.reactivex.Observable

class ViewModelClass : ViewModel() {

    val modelClass = ModelClass()


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