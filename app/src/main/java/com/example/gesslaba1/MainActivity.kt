package com.example.gesslaba1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.gesslaba1.NumberExercise

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton : Button = findViewById(R.id.button)
        val myTextView : TextView = findViewById(R.id.textView)

        val numEx = NumberExercise()

        myButton.setOnClickListener {
            myTextView.text = numEx.normalize()
        }
    }
}