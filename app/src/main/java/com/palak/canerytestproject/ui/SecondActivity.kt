package com.palak.canerytestproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.palak.canerytestproject.R
import com.palak.canerytestproject.model.User

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val user = intent?.getParcelableExtra<User>("User")!!

        println("User: $user")
    }
}