package com.mkmsoft.javacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText number1;
    EditText number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result);
        number1 = findViewById(R.id.number1Text);
        number2 = findViewById(R.id.number2Text);
    }

    @SuppressLint("SetTextI18n")
    public void add(View view){
        int firstNumber = convertStringToInteger(number1.getText().toString());
        int secondNumber = convertStringToInteger(number2.getText().toString());
        int resultValue = firstNumber + secondNumber;
        result.setText("Result: " + resultValue);
    }

    public void subtract(View view){
        int firstNumber = convertStringToInteger(number1.getText().toString());
        int secondNumber = convertStringToInteger(number2.getText().toString());
        int resultValue = firstNumber - secondNumber;
        result.setText("Result: " + resultValue);
    }

    public void multiply(View view){
        int firstNumber = convertStringToInteger(number1.getText().toString());
        int secondNumber = convertStringToInteger(number2.getText().toString());
        int resultValue = firstNumber * secondNumber;
        result.setText("Result: " + resultValue);
    }

    public void diversion(View view){
        int firstNumber = convertStringToInteger(number1.getText().toString());
        int secondNumber = convertStringToInteger(number2.getText().toString());
        if(secondNumber == 0)
        {
            result.setText("Diversion by 0 error!");
            return;
        }
        int resultValue = firstNumber / secondNumber;
        result.setText("Result: " + resultValue);
    }

    int convertStringToInteger(String text){
        if(text.isEmpty())
        {
            return 0;
        }
        return Integer.parseInt(text);
    }
}