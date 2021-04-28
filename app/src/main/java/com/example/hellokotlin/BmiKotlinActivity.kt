package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Exception

class BmiKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_view_binding)

        val heightField = findViewById<EditText>(R.id.height)
        val weightField = findViewById<EditText>(R.id.weight)
        val btnbmi = findViewById<Button>(R.id.btn_bmi)
        val result = findViewById<TextView>(R.id.result)

        btnbmi.setOnClickListener {
//            val height = heightField.getText().toString().toDouble()
//            val weight = weightField.getText().toString().toDouble()

            val sHeight = heightField.getText().toString()
            val sWeight = weightField.getText().toString()
            try{
                val bmi = sWeight.toDouble() / Math.pow(sHeight.toDouble() / 100.0, 2.0)
                result.setText("Your BMI = " + bmi);
            } catch(e : Exception) {
                result.setText("Input(s) missing")
            }
        }
    }
}