package com.example.manorroom.api

import retrofit2.http.GET

interface ZodiacApi {
    @GET("/horoscopes/")
    suspend fun fetchContents(): String
}