package com.fikranakbar.bisamasak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AboutMeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutme)

        actionBar?.setDisplayShowHomeEnabled(true)
        title = "About Me"
    }
}