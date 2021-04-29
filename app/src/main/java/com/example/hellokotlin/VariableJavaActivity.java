package com.example.hellokotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class VariableJavaActivity extends AppCompatActivity {
    int clickcount = 0;
    final long startTime = System.currentTimeMillis();

    TextView txtActivityStartTime, txtCountBtnClicks , txtElapsedTime;
    Button btnClickMe;
    long elapsedSeconds;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_variable);

        txtActivityStartTime = findViewById(R.id.txtActivityStartTime);
        txtCountBtnClicks = findViewById(R.id.txtCountBtnClicks);
        btnClickMe = findViewById(R.id.btnClickMe);
        txtElapsedTime = findViewById(R.id.txtElapsedTime);



        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickcount += 1;
                txtCountBtnClicks.setText("Button clicks: " + clickcount);
                elapsedSeconds = ((System.currentTimeMillis() - startTime)/1000);
                txtElapsedTime.setText(elapsedSeconds + " seconds elapsed");
            }
        });

        String timeText = new SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime);
        txtActivityStartTime.setText("Activity start time = " + timeText);
        txtCountBtnClicks.setText("Ready to start counting clicks");

    }
}
