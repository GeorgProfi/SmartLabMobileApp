package com.example.smartlabmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}