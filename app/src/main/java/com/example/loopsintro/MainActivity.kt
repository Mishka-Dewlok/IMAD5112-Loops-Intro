package com.example.loopsintro

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val textview = findViewById<TextView>(R.id.txtView)

        //clear textview
        var result = ""

        // loop from 1 to 20
        for (i in 1..20) {
            result = result + i + "\n"
        }
        textview.text = result



    }
}