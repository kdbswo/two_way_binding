package com.example.two_way_binding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var mutableAge = MutableLiveData(0)

    fun plus(){
        mutableAge.value = mutableAge.value?.plus(1)
    }

}