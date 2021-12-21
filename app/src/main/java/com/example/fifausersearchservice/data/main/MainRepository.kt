package com.example.fifausersearchservice.data.main

import com.example.fifausersearchservice.data.mainApi
import com.example.fifausersearchservice.feature.user.dto.ResponseUserDTO
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.annotations.NonNull
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers
import retrofit2.Call
import retrofit2.Response

class MainRepository{
    fun userPost(nickname: String) : @NonNull Single<Response<ResponseUserDTO>> =
        mainApi.createUserPost(nickname)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
}