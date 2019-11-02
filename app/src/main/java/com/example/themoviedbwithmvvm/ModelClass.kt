package com.example.themoviedbwithmvvm

import android.util.Log
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class ModelClass {

    companion object {

        fun provideRetrofit(): RetrofitInterface {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/3/search/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
            return retrofit.create(RetrofitInterface::class.java)
        }
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
