package com.example.manorroom.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ZodiacItem(
    @field:Json(name = "sign")
    val sign: String,
    @field:Json(name = "title")
    val title: String,
)