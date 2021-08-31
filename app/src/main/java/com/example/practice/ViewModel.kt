package com.example.practice

import androidx.lifecycle.*
import androidx.lifecycle.ViewModel
import com.example.domain.Model.Model
import com.example.domain.mainrepo
import kotlinx.coroutines.launch


class ViewModel(private val repo: mainrepo): ViewModel(){

    private  val _mylist : MutableLiveData<Model?> = MutableLiveData()
    val mylist : LiveData<Model?> = _mylist


    fun getJokeFromServer(){

        viewModelScope.launch {
            _mylist.value = repo.getList()
        }


    }
}

