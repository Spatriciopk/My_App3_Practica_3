package com.example.myapp3practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Ejercicio5 extends AppCompatActivity {

    EditText max1,max2,max3;
    Button ope;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio5);
        max1 = (EditText) findViewById(R.id.maxnum1);
        max2 = (EditText) findViewById(R.id.maxnum2);
        max3 = (EditText) findViewById(R.id.maxnum3);
        resultado = (TextView) findViewById(R.id.resultadomax);
        ope = (Button) findViewById(R.id.calcularmax);
    }
    public void main(View vista){
        Intent in = new Intent(this,MainActivity.class);
        startActivity(in);
    }

    public void calcularmax(View vista) {
        int num1 = Integer.parseInt(max1.getText().toString());
        int num2 = Integer.parseInt(max2.getText().toString());
        int num3 = Integer.parseInt(max2.getText().toString());
        int c=2;
        int mcd=1;
        while(c<=num1 && c<=num2 && c<=num3){
            while(num1%c==0 && num2%c==0 && num3%c==0){
                mcd=mcd*c;
                num1=num1/2;
                num2=num2/2;
                num3=num3/2;
            }
            c++;
        }
        resultado.setText("Máximo comun divisor "+String.valueOf(mcd));
    }
}