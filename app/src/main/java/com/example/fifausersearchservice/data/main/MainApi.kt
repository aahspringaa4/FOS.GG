package com.example.fifausersearchservice.data.main

import com.example.fifausersearchservice.feature.user.dto.ResponseUserDTO
import io.reactivex.rxjava3.core.Single
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface MainApi {
    @GET("users")
    fun createUserPost(
        @Header("Authorization") API_Key: String,
        @Query("nickname") nickname: String
    ): Single<Response<ResponseUserDTO>>
}