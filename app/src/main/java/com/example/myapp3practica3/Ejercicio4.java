package com.example.myapp3practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ejercicio4 extends AppCompatActivity {

    EditText fecha;
    Button ope;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4);
        fecha = (EditText) findViewById(R.id.fecha);
        resultado = (TextView) findViewById(R.id.resultadofecha);
        ope = (Button) findViewById(R.id.calcularfecha);
    }
    public void main(View vista){
        Intent in = new Intent(this,MainActivity.class);
        startActivity(in);
    }

    public void calculofecha(View vista){
        String strfecha = fecha.getText().toString();
        DateTimeFormatter formatter = null;
        try{
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            }
            LocalDate fechaNacimiento = null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                fechaNacimiento = LocalDate.parse(strfecha, formatter);
            }
            Period edad = null;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                edad = Period.between(fechaNacimiento, LocalDate.now());
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                resultado.setText(String.format("%d años, %d meses y %d días",
                        edad.getYears(),
                        edad.getMonths(),
                        edad.getDays()));

            }
        }catch (Exception e){
            resultado.setText("Formato Incorrecto (dd/mm/anño) -> (23/08/1998)");
        }

    }


}