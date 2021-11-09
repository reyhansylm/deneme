package com.example.yemeksepeti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import domain.FoodDamain;

public class Crd2 extends AppCompatActivity {
    private FoodDamain foodDamain;
    private TextView total;
    private ImageView gecpic;
    private int id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crd2);

        total=findViewById(R.id.totalfiyat);
        gecpic=findViewById(R.id.gecpic);
        issss();

    }


    public void issss(){

        foodDamain=(FoodDamain) getIntent().getSerializableExtra("nesne");

        total.setText(foodDamain.getFee()+" ");
        total.setText(foodDamain.getTitle());
    }
}