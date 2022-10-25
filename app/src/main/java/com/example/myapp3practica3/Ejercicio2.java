package com.example.myapp3practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Ejercicio2 extends AppCompatActivity {
    double resutlado,resutlado2;
    EditText a,b,c;
    Button ope;
    TextView resultado;
    private DecimalFormat df;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);
        a = (EditText) findViewById(R.id.numa);
        b = (EditText) findViewById(R.id.numb);
        c = (EditText) findViewById(R.id.numc);
        resultado = (TextView) findViewById(R.id.resultadoecuacion);
        df = new DecimalFormat("#.00");
        ope = (Button) findViewById(R.id.cacularecuacion);

    }
    public void main(View vista){
        Intent in = new Intent(this,MainActivity.class);
        startActivity(in);
    }

    public void  ecuacion2Grado(View vista) {
        double numa = Double.parseDouble(String.valueOf(a.getText()));
        double numb = Double.parseDouble(String.valueOf(b.getText()));
        double numc = Double.parseDouble(String.valueOf(c.getText()));
        if( numa !=0){
            double discriminante = (Math.pow(numb, 2) - (4 * numa * numc));

            if (discriminante >= 0) {

                // Una solucion
                if(discriminante == 0){

                    resutlado = (-1*numb) / (2 * numa);
                    resultado.setText("X="+String.valueOf(Double.parseDouble(df.format((resutlado)))));
                    // Dos soluciones
                }else{

                    resutlado = ((-1*numb) + Math.sqrt(Math.pow(numb, 2) - (4 * numa * numc))) / (2 * numa);

                    resutlado2 = ((-1*numb) - Math.sqrt(Math.pow(numb, 2) - (4 * numa * numc))) / (2 * numa);
                    resultado.setText("X1="+String.valueOf(Double.parseDouble(df.format(resutlado)) +"\nX2="+Double.parseDouble(df.format(resutlado2))));
                }


            } else {
                resultado.setText("El sistema no tiene solución");

            }
        }
      else{
            resultado.setText("El sistema no tiene solución");
        }

    }
}