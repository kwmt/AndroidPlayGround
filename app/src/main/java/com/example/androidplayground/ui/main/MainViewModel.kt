package com.example.androidplayground.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _defaultValue = MutableLiveData<Boolean>(false)
    val defaultValue: LiveData<Boolean> = _defaultValue
    private val _noDefaultValue = MutableLiveData<Boolean>()
    val noDefaultValue: LiveData<Boolean> = _noDefaultValue
}
