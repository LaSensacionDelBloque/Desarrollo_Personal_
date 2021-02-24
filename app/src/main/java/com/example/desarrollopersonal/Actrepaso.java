package com.example.desarrollopersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Actrepaso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actrepaso);
    }

    //Botones cambio de ventana
    public void Unida1(View view) {
        Intent siguiente = new Intent(this, Unidad1.class);
        startActivity(siguiente);
    }

    public void Unidad2(View view) {
        Intent siguiente = new Intent(this, Unidad2.class);
        startActivity(siguiente);
    }

    public void Unidad3(View view) {
        Intent siguiente = new Intent(this, Unidad3.class);
        startActivity(siguiente);
    }


}