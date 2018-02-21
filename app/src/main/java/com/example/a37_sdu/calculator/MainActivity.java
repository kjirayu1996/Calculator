package com.example.a37_sdu.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //1. Explicit
    EditText number1EdtText, number2EdtText;
    Button addButton, delButton, plusButton, divideButton;
    TextView resultTextView;
    int num1, num2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //2 Initail view ผูกตัวแปรบน Java กับ element บน xml
    number1EdtText = findViewById(R.id.edtNumber1);
    number2EdtText = findViewById(R.id.edtNumber2);
    addButton = findViewById(R.id.btnAdd);
    delButton = findViewById(R.id.btnDel);
    plusButton = findViewById(R.id.btnPlus);
    divideButton = findViewById(R.id.btnDivide);
    resultTextView = findViewById(R.id.txvResult);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //แปลงค่าที่รับจาก EditText เป็นตัวเลข แล้วก็บลงในตัวแปรชนิด int
            num1 = Integer.parseInt(number1EdtText.getText().toString().trim());
            num2 = Integer.parseInt(number2EdtText.getText().toString().trim());
            result = num1 + num2;

                //4. ผลลัพท์การคำนวณ
            resultTextView.setText(result + "");

        }
    });//endOnClickListener

        delButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(number1EdtText.getText().toString().trim());
                num2 = Integer.parseInt(number2EdtText.getText().toString().trim());
                result = num1 - num2;

                resultTextView.setText(result + "");

            }
        });

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(number1EdtText.getText().toString().trim());
                num2 = Integer.parseInt(number2EdtText.getText().toString().trim());
                result = num1 * num2;

                resultTextView.setText(result + "");

            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(number1EdtText.getText().toString().trim());
                num2 = Integer.parseInt(number2EdtText.getText().toString().trim());
                result = num1 / num2;

                resultTextView.setText(result + "");

            }
        });//endOnClickListener

    } //end merthod onCreate

} //end class