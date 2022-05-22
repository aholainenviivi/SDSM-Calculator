package com.example.myapplication;

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

        EditText firstNumberEditText = findViewById(R.id.firstNumberEditText);
        EditText secondNumberEditText = findViewById(R.id.secondNumberEditText);
        TextView resultTextView = findViewById(R.id.resultTextView);

        Button addButton = findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(firstNumberEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumberEditText.getText().toString());
                addNumbers(num1, num2);
            }
        });

        Button subtractButton = findViewById(R.id.subtractButton);
        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(firstNumberEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumberEditText.getText().toString());
                subtractNumbers(num1, num2);
            }
        });

        Button multiplyButton = findViewById(R.id.multiplyButton);
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(firstNumberEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumberEditText.getText().toString());
                multiplyNumbers(num1, num2);
            }
        });

        Button divideButton = findViewById(R.id.divideButton);
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(firstNumberEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumberEditText.getText().toString());
                divideNumbers(num1, num2);
            }
        });

    }

    protected void addNumbers(int num1, int num2) {
        int result = num1 + num2;
        TextView resultTextView = findViewById(R.id.resultTextView);
        resultTextView.setText(result + "");
    }

    protected void subtractNumbers(int num1, int num2) {
        int result = num1 - num2;
        TextView resultTextView = findViewById(R.id.resultTextView);
        resultTextView.setText(result + "");
    }

    protected void multiplyNumbers(int num1, int num2) {
        int result = num1 * num2;
        TextView resultTextView = findViewById(R.id.resultTextView);
        resultTextView.setText(result + "");
    }

    protected void divideNumbers(int num1, int num2) {
        float result = (float) num1 / num2;
        TextView resultTextView = findViewById(R.id.resultTextView);
        resultTextView.setText(result + "");
    }

}