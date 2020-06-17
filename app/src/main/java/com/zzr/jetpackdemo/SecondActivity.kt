package com.zzr.jetpackdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zzr.jetpackdemo.databinding.ActivitySecondBinding
import com.zzr.jetpackdemo.viewmodel.LoginModel
import com.zzr.jetpackdemo.viewmodel.SecondModel

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_second)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val model = SecondModel()
        binding.tvName.text = model.name
        binding.button.setOnClickListener { model.userClick() }
    }
}