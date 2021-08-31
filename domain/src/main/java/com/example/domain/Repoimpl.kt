package com.example.domain

import android.util.Log
import com.example.domain.Model.Model

class Repoimpl
    (private val apiService: restapi) : mainrepo
    {
        override suspend fun getList(): Model?{
            return try {
                apiService.getList()
            } catch (e: Exception) {
                Log.e("Error", e.stackTraceToString())
                null
            }
        }

    }
