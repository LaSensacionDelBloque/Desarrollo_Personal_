package com.example.desarrollopersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Entretenimiento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entretenimiento);
    }
    public void Video(View view) {
        Intent url = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=DWTtOVVr2zI&t"));
        startActivity(url);
    }
    public void IPN(View view) {
        Intent url = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ipn.mx/"));
        startActivity(url);
    }
    public void Cecyt1(View view) {
        Intent url = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cecyt1.ipn.mx/"));
        startActivity(url);
    }
    public void Saes(View view) {
        Intent url = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.saes.cecyt1.ipn.mx/"));
        startActivity(url);
    }
    public void BBC(View view) {
        Intent url = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bbc.com/mundo"));
        startActivity(url);
    }
}