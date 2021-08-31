package com.example.domain

import com.example.domain.Model.Model

interface mainrepo {

    suspend fun getList(): Model?
}