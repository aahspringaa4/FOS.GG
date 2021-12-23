package com.example.fifausersearchservice.data.main

import ACCESS_TOKEN
import API_Key
import com.example.fifausersearchservice.data.mainApi
import com.example.fifausersearchservice.feature.user.dto.ResponseMaxDivisionDTO
import com.example.fifausersearchservice.feature.user.dto.ResponseUserDTO
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.annotations.NonNull
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers
import retrofit2.Call
import retrofit2.Response

class MainRepository{
    fun userGet(nickname: String) : @NonNull Single<Response<ResponseUserDTO>> =
        mainApi.readUserGet(API_Key, nickname)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())

    fun maxDivisionGet() : @NonNull Single<Response<ResponseMaxDivisionDTO>> =
        mainApi.readMaxDivisionGet(API_Key, ACCESS_TOKEN)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
}