package com.palak.canerytestproject.ui.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfileViewModel : ViewModel(){

    private val _profileName = MutableLiveData<String>().apply {
        value = "I am Palakkumar!"
    }

    val profileName : LiveData<String> = _profileName
}
