package com.example.myapp3practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner menu = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu = findViewById(R.id.spnmenu);
        ArrayList<String> listOpcion = new ArrayList<String>();
        listOpcion.add("Ejercicio1");
        listOpcion.add("Ejercicio2");
        listOpcion.add("Ejercicio3");
        listOpcion.add("Ejercicio4");
        listOpcion.add("Ejercicio5");
        ArrayAdapter<String> listAdaptada = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,listOpcion);
        menu.setAdapter(listAdaptada);

    }

    public void itemSelect(View vista){
        String item = menu.getSelectedItem().toString();
        if(item.equals("Ejercicio1")){
            Intent in = new Intent(this,Ejercicio1.class);
            startActivity(in);
        }
        else if(item.equals("Ejercicio2")){
            Intent in = new Intent(this,Ejercicio2.class);
            startActivity(in);
        }
        else if(item.equals("Ejercicio3")){
            Intent in = new Intent(this,Ejercicio3.class);
            startActivity(in);
        }
        else if(item.equals("Ejercicio4")){
            Intent in = new Intent(this,Ejercicio4.class);
            startActivity(in);
        }
        else if(item.equals("Ejercicio5")){
            Intent in = new Intent(this,Ejercicio5.class);
            startActivity(in);
        }
    }
    public void ejercicio1(View vista){
        Intent in = new Intent(this,Ejercicio1.class);
        startActivity(in);
    }
    public void ejercicio2(View vista){
        Intent in = new Intent(this,Ejercicio2.class);
        startActivity(in);
    }
    public void ejercicio3(View vista){
        Intent in = new Intent(this,Ejercicio3.class);
        startActivity(in);
    }
    public void ejercicio4(View vista){
        Intent in = new Intent(this,Ejercicio4.class);
        startActivity(in);
    }
    public void ejercicio5(View vista){
        Intent in = new Intent(this,Ejercicio5.class);
        startActivity(in);
    }
}