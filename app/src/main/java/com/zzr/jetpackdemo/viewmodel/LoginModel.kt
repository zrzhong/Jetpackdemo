package com.zzr.jetpackdemo.viewmodel

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.databinding.ObservableField
import com.zzr.jetpackdemo.SecondActivity

class LoginModel(name: String, password: String, context: Context) {
    private val name2 = ObservableField(name)
    private val password2 = ObservableField(password)
    var context = context

    fun onNameChange(s: CharSequence) {
        name2.set(s.toString())
    }

    fun onPwdChange(s: CharSequence, start: Int, before: Int, count: Int) {
        password2.set(s.toString())
    }

    fun login() {
        if (name2.get().equals("jack") && password2.get().equals("123")) {
            Toast.makeText(context, "账号密码正确", Toast.LENGTH_SHORT).show()
            val intent = Intent(context, SecondActivity::class.java)
            context.startActivity(intent)
        } else {
            Toast.makeText(context, "账号或密码错误", Toast.LENGTH_SHORT).show()
        }
    }
}