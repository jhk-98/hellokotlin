package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FlowControlKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_flowcontrol)

        val btnFlowControlKotlin = findViewById<Button>(R.id.btnFlowControlKotlin)

    }
}