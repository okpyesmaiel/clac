package com.example.clac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText num1 = findViewById(R.id.num1);
        EditText num2 =findViewById(R.id.num2);
        Button sum = findViewById(R.id.sum);
        Button sub = findViewById(R.id.sub);
        Button mult = findViewById(R.id.mult);
        Button div = findViewById(R.id.div);
        TextView  Result = findViewById(R.id.Result);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString().trim());
                int number2 = Integer.parseInt(num2.getText().toString().trim());
                int res = number1+number2;
                Result.setText("Result is"+res);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString().trim());
                int number2 = Integer.parseInt(num2.getText().toString().trim());

                int res =number1-number2;
                Result.setText("Result is"+res);
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString().trim());
                int number2 = Integer.parseInt(num2.getText().toString().trim());
                int res = number1*number2;
                Result.setText("Result is"+res);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString().trim());
                int number2 = Integer.parseInt(num2.getText().toString().trim());
                int res = number1/number2;
                Result.setText("Result is"+res);
            }
        });
    }
}