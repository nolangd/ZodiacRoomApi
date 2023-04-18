package com.example.manorroom.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import retrofit2.http.GET

interface ZodiacApi {
    @GET("/horoscopes/")
    suspend fun fetchContents(): List<ZodiacItem>
}