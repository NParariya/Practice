package com.example.practice

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.domain.Repoimpl
import com.example.domain.retrofitbuilder
import java.lang.IllegalArgumentException

class ViewModelFactory(): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        if (modelClass.isAssignableFrom(com.example.practice.ViewModel::class.java)) {

            return ViewModel(Repoimpl(retrofitbuilder.apiService)) as T

        }     //(RetroFitBuilder.apiService)

        throw IllegalArgumentException("unknown class name error")

    }
}