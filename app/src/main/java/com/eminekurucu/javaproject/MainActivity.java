package com.eminekurucu.javaproject;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // Tanımlamaları yapıyoruz
    EditText number1Text;
    EditText number2Text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) { // telefon açılınca ilk çalışan
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Tanımlanan değerlere değişkenleri atıyoruz
        number1Text = findViewById(R.id.number1Text);
        number2Text = findViewById(R.id.number2Text);
        resultText = findViewById(R.id.resultText);

    }

    public void sum(View view){
        // getText editable bir tür direk işleme sokulamaz stringe çevirdik
        // ardından işlem yapabilmek için integer a çeviricez

        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
           resultText.setText("Enter number!");
        } else {
            int number1 = Integer.parseInt(number1Text.getText().toString()); // girilen sayı int
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 + number2;

            // resul'ı yazdırırken tekrar stringe çevirmemiz gerek
            resultText.setText("Result: "+ result);
        }

    }

    public void deduct(View view){
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Enter number!");
        } else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 - number2;
            resultText.setText("Result: "+ result);
        }

    }

    public void multiply(View view){
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Enter number!");
        } else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 * number2;
            resultText.setText("Result: "+ result);
        }

    }

    public void divide(View view){
        if (number1Text.getText().toString().matches("") || number1Text.getText().toString().matches("")){
            resultText.setText("Enter number!");
        }else if (Integer.parseInt(number2Text.getText().toString()) == 0) {
            resultText.setText("Cannot zero division!");
        }
        else {
            int number1= Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 / number2;
            resultText.setText("Result: "+ result);

        }

    }
}