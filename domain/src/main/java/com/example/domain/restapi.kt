package com.example.domain

import com.example.domain.Model.Model
import retrofit2.http.GET

interface restapi {

    @GET("random_joke")
    suspend fun getList(): Model

}