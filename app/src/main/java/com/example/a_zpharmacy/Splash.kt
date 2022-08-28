package com.example.a_zpharmacy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class Splash : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        handler=Handler(Looper.getMainLooper())
        handler.postDelayed({
          var intent=  Intent(this,Login::class.java)
            startActivity(intent)
            finish() },
            2000 )
    }
}