package com.example.lab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {
    private Button prevbtn;
    private EditText Input1, Input2;
    private TextView textView;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2); // Changed to correct layout

        textView = findViewById(R.id.textView);
        Input1 = findViewById(R.id.Input1);
        Input2 = findViewById(R.id.Input2);
        button1 = findViewById(R.id.Button1);

        prevbtn = findViewById(R.id.btn2);

        View.OnClickListener OclBtnGoBack = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, MainActivity.class);
                startActivity(intent);
            }
        };
        prevbtn.setOnClickListener(OclBtnGoBack);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(Input1.getText().toString());
                float num2 = Float.parseFloat(Input2.getText().toString());
                float res = num1 - num2;
                textView.setText(String.valueOf(res));
            }
        });
    }
}
