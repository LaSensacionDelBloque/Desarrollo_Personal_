package com.example.desarrollopersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Contacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
    }

    public void Classroom(View view) {
        Intent url = new Intent(Intent.ACTION_VIEW, Uri.parse("https://classroom.google.com/u/0/h?hl=es"));
        startActivity(url);
    }
    public void Whats(View view) {
        Intent url = new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.whatsapp.com/"));
        startActivity(url);
    }
    public void Gmail(View view) {
        Intent url = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mail.google.com/mail/u/0/#"));
        startActivity(url);
    }
    public void Outlook(View view) {
        Intent url = new Intent(Intent.ACTION_VIEW, Uri.parse("https://outlook.live.com/owa/"));
        startActivity(url);
    }




}