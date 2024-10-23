package com.example.fincanceapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Menggunakan layout activity_main.xml sebagai konten utama
        setContentView(R.layout.activity_main)
    }
}