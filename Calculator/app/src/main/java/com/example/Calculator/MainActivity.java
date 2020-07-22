package com.example.Calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView data;
    TextView output;
    Button addorsub;
    Button brackets;
    Button percentage;
    Button division;
    Button number7;
    Button number8;
    Button number9;
    Button multiplication;
    Button number4;
    Button number5;
    Button number6;
    Button substraction;
    Button number1;
    Button number2;
    Button number3;
    Button addition;
    Button clear;
    Button number0;
    Button dot;
    Button equal;

    float valueone;
    float valuetwo;

    boolean maddition;
    boolean msubstraction;
    boolean mmultiplication;
    boolean mdivision;
    boolean mpercentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = findViewById(R.id.data);
        output = findViewById(R.id.output);
        addorsub = findViewById(R.id.addorsub);
        brackets = findViewById(R.id.brackets);
        percentage = findViewById(R.id.percentage);
        division = findViewById(R.id.divison);
        multiplication = findViewById(R.id.multiplication);
        substraction = findViewById(R.id.substraction);
        addition = findViewById(R.id.addition);
        clear = findViewById(R.id.clear);
        dot = findViewById(R.id.dot);
        equal = findViewById(R.id.equal);
        number7 = findViewById(R.id.number7);
        number8 = findViewById(R.id.number8);
        number9 = findViewById(R.id.number9);
        number4 = findViewById(R.id.number4);
        number5 = findViewById(R.id.number5);
        number6 = findViewById(R.id.number6);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        number3 = findViewById(R.id.number3);
        number0 = findViewById(R.id.number0);

        number0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText() + "0");
            }
        });

        number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText() + "1");
            }
        });

        number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText() + "2");
            }
        });

        number3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText() + "3");
            }
        });

        number4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { data.setText(data.getText() + "4");
            }
        });

        number5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText() + "5");
            }
        });

        number6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText() + "6");
            }
        });

        number7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText() + "7");
            }
        });

        number8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText() + "8");
            }
        });

        number9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText() + "9");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText() + ".");
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText("");
                output.setText("");
            }
        });

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(data == null){
                    output.setText("");
                }
                else{
                    valueone = Float.parseFloat(data.getText() + "");
                    maddition = true;
                    data.setText(null);
                }
            }
        });

        substraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueone = Float.parseFloat(data.getText() + "");
                msubstraction = true;
                data.setText(null);
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueone = Float.parseFloat(data.getText() + "");
                mmultiplication = true;
                data.setText(null);
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueone = Float.parseFloat(data.getText() + "");
                mdivision = true ;
                data.setText(null);
            }
        });

        percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueone = Float.parseFloat(data.getText() + "");
                mpercentage = true;
                data.setText(null);
            }
        });

        addorsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueone = Float.parseFloat(data.getText() + "");
                output.setText((-1) * valueone + "");
            }
        });

        brackets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueone = Float.parseFloat(data.getText() + "");
                output.setText((valueone) + "");
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                valuetwo = Float.parseFloat(data.getText() +"");

                if(maddition == true){
                    output.setText(valueone + valuetwo + "");
                    maddition = false;
                }

                if(msubstraction == true){
                    output.setText(valueone - valuetwo + "");
                    msubstraction = false;
                }

                if(mmultiplication == true){
                    output.setText(valueone * valuetwo + "");
                    mmultiplication = false;
                }

                if(mdivision == true){
                    output.setText(valueone / valuetwo + "");
                    mdivision = false;
                }

                if(mpercentage == true){
                    output.setText(valueone % valuetwo + "");
                    mpercentage = false;
                }

            }
        });


    }
}