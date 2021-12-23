package com.example.fifausersearchservice.data.main

import ACCESS_TOKEN
import com.example.fifausersearchservice.feature.user.dto.ResponseMaxDivisionDTO
import com.example.fifausersearchservice.feature.user.dto.ResponseUserDTO
import io.reactivex.rxjava3.core.Single
import retrofit2.Response
import retrofit2.http.*

interface MainApi {
    @GET("users")
    fun readUserGet(
        @Header("Authorization") API_Key: String,
        @Query("nickname") nickname: String
    ): Single<Response<ResponseUserDTO>>

    @GET("users/{accessid}/maxdivision")
    fun readMaxDivisionGet(
        @Header("Authorization") API_Key: String,
        @Path("accessid") ACCESS_TOKEN: String
    ): Single<Response<ResponseMaxDivisionDTO>>
}