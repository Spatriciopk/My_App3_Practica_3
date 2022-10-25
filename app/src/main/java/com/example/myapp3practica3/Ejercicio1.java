package com.example.myapp3practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio1 extends AppCompatActivity {

    TextView resultado;
    EditText ingresonota;
    Button calcularNota;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);
        resultado = (TextView) findViewById(R.id.resultadoNota);
        ingresonota = (EditText) findViewById(R.id.nota);
        calcularNota = (Button) findViewById(R.id.calcularNota);
    }

    public void main(View vista){
        Intent in = new Intent(this,MainActivity.class);
        startActivity(in);
    }
    public void calculo(View vista){
        double nt = Double.parseDouble(String.valueOf(ingresonota.getText()));

        excepcion(nt);
    }

    public void excepcion(double rst){
        if(rst <0 || rst>20)
            resultado.setText("La nota  debe ser mayor 0 o menor a 20");
        else if( rst >= 0 && rst <=10.5)
            resultado.setText("Estudiante Malo");
        else if( rst > 10.5 && rst <= 14)
            resultado.setText("Estudiante Regular");
        else if( rst > 14 && rst <= 18.9)
            resultado.setText("Estudiante Bueno");
        else if( rst > 18.9 && rst <= 20)
            resultado.setText("Estudiante Excelente");
    }
}