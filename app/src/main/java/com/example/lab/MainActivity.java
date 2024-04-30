package com.example.lab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText Input1, Input2;
    private Button button1;
     private Button nextbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    textView = findViewById(R.id.textView);
    Input1 =  findViewById(R.id.Input1);
    Input2 =  findViewById(R.id.Input2);
    button1 = findViewById(R.id.Button1);
    nextbtn = findViewById(R.id.btn);

    View.OnClickListener OclBtn  = new View.OnClickListener() {
        @Override
        public void onClick(View v)
        {
            Intent intent = new Intent(MainActivity.this, Activity2.class);
            startActivity(intent);
        }
    };
    nextbtn.setOnClickListener(OclBtn);

    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            float num1 = Float.parseFloat(Input1.getText().toString());
            float num2 = Float.parseFloat(Input2.getText().toString());
            float res = num1 + num2;
            textView.setText(String.valueOf(res));
        }
    });
    }
}
