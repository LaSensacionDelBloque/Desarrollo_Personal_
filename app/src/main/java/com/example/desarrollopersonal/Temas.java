package com.example.desarrollopersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Temas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temas);
    }
    public void Tecnicas(View view) {
        Intent siguiente = new Intent(this, Tecnicas.class);
        startActivity(siguiente);

    }
    public void Lectura(View view) {
        Intent siguiente = new Intent(this, Lectura.class);
        siguiente.putExtra("dato","Ejercicios para mejorar tu lectura.pdf");
        startActivity(siguiente);
    }
    public void Habitos(View view) {
        Intent siguiente = new Intent(this, Lectura.class);
        siguiente.putExtra("dato","Creacion de habitos.pdf");
        startActivity(siguiente);
    }
    public void Word(View view) {
        Intent siguiente = new Intent(this, Lectura.class);
        siguiente.putExtra("dato","Mejorar trabajos en word.pdf");
        startActivity(siguiente);
    }
}