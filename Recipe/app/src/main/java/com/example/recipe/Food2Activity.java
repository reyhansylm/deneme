package com.example.recipe;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;

import com.example.recipe.databinding.ActivityFood2Binding;

import static com.example.recipe.R.drawable.bread;
import static com.example.recipe.R.drawable.pizza;

public class Food2Activity extends AppCompatActivity {

    private ActivityFood2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFood2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        final String gelen1= getIntent().getStringExtra("pizza");
        final String gelen2= getIntent().getStringExtra("pizza2");
        final String gelen3= getIntent().getStringExtra("pizza3");
        final String gelen4= getIntent().getStringExtra("pizza4");
        final String gelen5= getIntent().getStringExtra("pizza5");
        final String gelen6= getIntent().getStringExtra("pizza6");

        final String b1= getIntent().getStringExtra("bread");
        final String b2= getIntent().getStringExtra("bread2");
        final String b3= getIntent().getStringExtra("bread3");
        final String b4= getIntent().getStringExtra("bread4");
        final String b5= getIntent().getStringExtra("bread5");
        final String b6= getIntent().getStringExtra("bread6");


        binding.check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        binding.check2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                binding.check2.setText(gelen2);
                binding.check2.setText(b2);
            }
        });

        binding.check3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                binding.check3.setText(gelen3);
            }
        });

        binding.check4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                binding.check4.setText(gelen4);
            }
        });

        binding.check5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                binding.check5.setText(gelen5);
            }
        });

        binding.check6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                binding.check6.setText(gelen6);
            }
        });


        binding.btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent back=new Intent(Food2Activity.this,FoodActivity.class);
                startActivity(back);
            }
        });














    }
}