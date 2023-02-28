package com.example.webviewactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class Flash_Activity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flash)
    var handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            var intent =Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}