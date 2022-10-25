package com.example.myapp3practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.GregorianCalendar;

public class Ejercicio3 extends AppCompatActivity {
    EditText anio;
    Button ope;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);
        anio = (EditText) findViewById(R.id.aniobisiesto);
        resultado = (TextView) findViewById(R.id.resultadoanio);

        ope = (Button) findViewById(R.id.calcularanio);
    }
    public void regresar(View vista){
        Intent in = new Intent(this,MainActivity.class);
        startActivity(in);
    }

    public void calcular_anio(View vista){
        GregorianCalendar calendar = new GregorianCalendar();
        if(Integer.parseInt(anio.getText().toString()) >-1){
            if (calendar.isLeapYear(Integer.parseInt(anio.getText().toString())))
                resultado.setText("El año es bisiesto");

            else
                resultado.setText("El año no es bisiesto");
        }
        else
            resultado.setText("Ingrese un año valido");
    }
}