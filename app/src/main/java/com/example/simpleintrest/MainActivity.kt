package com.example.simpleintrest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?)
        {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            val btn     = findViewById<Button>(R.id.btn)
            val num1    = findViewById<EditText>(R.id.principle)
            val num2    = findViewById<EditText>(R.id.rate)
            val num3    = findViewById<EditText>(R.id.time)
            val ans     = findViewById<TextView>(R.id.output)



        btn.setOnClickListener(){
            val p   =   num1.text.toString().toFloat()
            val r   =   num2.text.toString().toFloat()
            val t   =   num3.text.toString().toFloat()
            val f   =   (p*r*t)/100
            ans.text= f.toString()

        }
    }
}