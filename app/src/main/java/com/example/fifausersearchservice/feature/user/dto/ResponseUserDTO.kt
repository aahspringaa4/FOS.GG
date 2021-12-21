package com.example.fifausersearchservice.feature.user.dto

data class ResponseUserDTO(
    val accessId: String,
    val nickname: String,
    val level: Int
)