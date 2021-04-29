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
        val btnVarJava = findViewById<Button>(R.id.btnVarJava)
        val btnVarKotlin = findViewById<Button>(R.id.btnVarKotlin)
        //btnHello = findViewById(R.id.btnHello)
        btnJava.setOnClickListener {
            startActivity(Intent(this,BmiJavaActivity::class.java))

        }
        btnKotlin.setOnClickListener{
            startActivity(Intent(this,BmiKotlinActivity::class.java))

        }
        btnVarJava.setOnClickListener{
            startActivity(Intent(this,VariableJavaActivity::class.java))

        }
        btnVarKotlin.setOnClickListener{
            startActivity(Intent(this,VariableKotlinActivity::class.java))

        }
    }
}