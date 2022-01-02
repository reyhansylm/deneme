package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Bitis extends AppCompatActivity {

    TextView score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitis);

       score= findViewById(R.id.score);

        Intent intent=getIntent();
        String scored=intent.getStringExtra("key");
        score.setText("Scorunuz"+ scored);
    }
}