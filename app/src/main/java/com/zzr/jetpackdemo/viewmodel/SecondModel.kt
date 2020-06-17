package com.zzr.jetpackdemo.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel

class SecondModel : ViewModel() {
    val name = "Jack"
    fun userClick() {
        Log.i("SecondModel", "userClick: ")
    }
}