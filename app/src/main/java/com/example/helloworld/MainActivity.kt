package com.example.helloworld

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var button_sayHello = findViewById<Button>(R.id.button_sayHello)
        button_sayHello.setOnClickListener{
            Log.v("Hello World", "Button Clicked")
            Toast.makeText(this, "Hello to you too!", Toast.LENGTH_SHORT ).show()
        }
    }
}