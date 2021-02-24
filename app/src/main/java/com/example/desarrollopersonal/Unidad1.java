package com.example.desarrollopersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Unidad1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unidad1);
    }
    public void Maslow(View view) {
        Intent video = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=K-XqtJfpS68&t"));
        startActivity(video);
    }

}