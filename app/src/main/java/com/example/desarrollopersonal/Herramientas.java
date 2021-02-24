package com.example.desarrollopersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Herramientas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herramientas);
    }
    public void Ptable(View view) {
        Intent url = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ptable.com/?lang=es"));
        startActivity(url);
    }
    public void Symbolab(View view) {
        Intent url = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.symbolab.com/"));
        startActivity(url);
    }
    public void Desmos(View view) {
        Intent url = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.desmos.com/calculator"));
        startActivity(url);
    }
    public void Khan(View view) {
        Intent url = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.khanacademy.org/"));
        startActivity(url);
    }
    public void Drive(View view) {
        Intent url = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/intl/es_ALL/drive/"));
        startActivity(url);
    }
    public void Powtoon(View view) {
        Intent url = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.powtoon.com/home/?"));
        startActivity(url);
    }
    public void Canva(View view) {
        Intent url = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.canva.com/es_mx/"));
        startActivity(url);
    }
    public void thisissand(View view) {
        Intent url = new Intent(Intent.ACTION_VIEW, Uri.parse("https://thisissand.com/"));
        startActivity(url);
    }
}