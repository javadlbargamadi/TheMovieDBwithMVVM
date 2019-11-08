package com.example.themoviedbwithmvvm

import android.util.Log
import com.example.themoviedbwithmvvm.MovieListClass.MovieListClass
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class ModelClass {

    fun getMoviesContain(title: String): Observable<MovieListClass> {
        return RetrofitProvider.provideRetrofit()
            .getMovieList(title)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }

//            .getMovieList(movieName)
//            .subscribeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe({
//                tmDbPresenter.onMovieListReceived(it.results as ArrayList<Result>)
//            }, {
//                Log.d("MYTAG", it.message)
//            })
}
