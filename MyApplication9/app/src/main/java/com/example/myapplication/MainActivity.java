package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.databinding.ActivityMainBinding;

import java.security.Key;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private int highscore;
    private @NonNull ActivityMainBinding binding;
    private DbHelper db;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        db= new DbHelper(this);



        binding.girisyap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Giriş Başarılı",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,Question.class);
                startActivity(intent);


            }
        });

       binding.uye.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {


               Intent intent=new Intent(MainActivity.this,Login.class);
               startActivity(intent);



           }
       });


       binding.devamet.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(MainActivity.this,Question.class);
               startActivity(intent);

           }
       });

    }


}