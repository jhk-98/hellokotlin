package com.example.hellokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var btnHello : Button // val == final, const
        val btnJava = findViewById<Button>(R.id.btn_Java)
        val btnKotlin = findViewById<Button>(R.id.btn_kotlin)
        //btnHello = findViewById(R.id.btnHello)
        btnJava.setOnClickListener {
            val javaIntent = Intent(this,BmiJavaActivity::class.java)
            startActivity(javaIntent)
        }
        btnKotlin.setOnClickListener{
            val kotlinIntent = Intent(this,BmiKotlinActivity::class.java)
            startActivity(kotlinIntent)
        }
    }
}