package com.example.hellokotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BmiJavaActivity extends AppCompatActivity {

    Button btnbmi;
    EditText height,weight;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_view_binding);

        btnbmi = findViewById(R.id.btn_bmi);
        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        result = findViewById(R.id.result);

        btnbmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sHeight = height.getText().toString();
                String sWeight = weight.getText().toString();
//                try {
//                    double bmi = Double.parseDouble(sWeight) / Math.pow(Double.parseDouble(sHeight) / 100.0, 2.0);
//                    result.setText("Your BMI = " + bmi);
//                } catch (Exception e){
//                    result.setText("Input(s) missing");
//                }
                if(!(sHeight.isEmpty() || sWeight.isEmpty())){
                    double bmi = Double.parseDouble(sWeight) / Math.pow(Double.parseDouble(sHeight) / 100.0, 2.0);
                    result.setText("Your BMI = " + bmi);
                } else{
                    result.setText("Input(s) missing");
                }
            }
        });

    }
}