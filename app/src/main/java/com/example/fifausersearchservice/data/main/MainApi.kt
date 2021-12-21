package com.example.fifausersearchservice.data.main

import com.example.fifausersearchservice.feature.user.dto.ResponseUserDTO
import io.reactivex.rxjava3.core.Single
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.POST
import retrofit2.http.Path

interface MainApi {
    @POST("users/{nickname}")
    fun createUserPost(
        @Path("nickname") nickname: String
    ): Single<Response<ResponseUserDTO>>
}