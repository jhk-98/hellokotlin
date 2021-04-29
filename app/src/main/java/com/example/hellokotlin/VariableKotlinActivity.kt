package com.example.hellokotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.sql.Time
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*
import kotlin.system.measureTimeMillis


class VariableKotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_variable)

        val txtActivityStartTime = findViewById<TextView>(R.id.txtActivityStartTime)
        val txtCountBtnClicks = findViewById<TextView>(R.id.txtCountBtnClicks)
        val btnClickMe = findViewById<Button>(R.id.btnClickMe)

        var clickCount = 0
        val startTime = System.currentTimeMillis()
        val stimeStamp = SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime)
        txtActivityStartTime.text = "Activity start time =  ${stimeStamp}"

        btnClickMe.setOnClickListener {
            clickCount ++
            txtCountBtnClicks.text = "Button clicks = ${clickCount}"

        }
        txtCountBtnClicks.text = "Ready to start counting clicks"
    }
}