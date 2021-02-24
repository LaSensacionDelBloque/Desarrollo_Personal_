package com.example.desarrollopersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Botones cambio de ventana
    public void Actrepaso(View view) {
        Intent siguiente = new Intent(this, Actrepaso.class);
        startActivity(siguiente);
    }
    public void Temas(View view){
        Intent siguiente = new Intent( this, Temas.class);
        startActivity(siguiente);
    }

    public void Herramientas(View view){
        Intent siguiente = new Intent( this, Herramientas.class);
        startActivity(siguiente);
    }

    public void Entretenimiento(View view){
        Intent siguiente = new Intent( this, Entretenimiento.class);
        startActivity(siguiente);
    }

    public void Contacto(View view){
        Intent siguiente = new Intent( this, Contacto.class);
        startActivity(siguiente);
    }




}