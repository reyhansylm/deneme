package com.example.recipe;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.recipe.databinding.ActivityFoodBinding;

public class FoodActivity extends AppCompatActivity {

    private ActivityFoodBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFoodBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Glide.with(this).load(R.drawable.giff).into(binding.logo);
        Glide.with(this).load(R.drawable.pizza).into(binding.pizza);
        Glide.with(this).load(R.drawable.bread).into(binding.bread);
        Glide.with(this).load(R.drawable.spaghetti).into(binding.spagetti);
        Glide.with(this).load(R.drawable.hamburger).into(binding.hamburger);




        binding.pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent next = new Intent(FoodActivity.this, Food2Activity.class);
                next.putExtra("pizza", "Salam");
                next.putExtra("pizza2", "SUCUK");
                next.putExtra("pizza3", "SOSİS");
                next.putExtra("pizza4", "MISIR");
                next.putExtra("pizza5", "MANTAR");
                next.putExtra("pizza6", "ZEYTİN");


                startActivity(next);
                finish();


            }
        });

        binding.bread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent next = new Intent(FoodActivity.this, Food2Activity.class);
                next.putExtra("bread","YUMURTA");
                next.putExtra("bread2", "UN");
                next.putExtra("bread3", "DOMATES");
                next.putExtra("bread4", "SALATALIK");
                next.putExtra("bread5", "TURŞU");
                next.putExtra("bread6", "GÖBEK");

                startActivity(next);
                finish();
            }
        });

        binding.spagetti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent next = new Intent(FoodActivity.this, Food2Activity.class);
                next.putExtra("spagetti","YUMURTA");
                next.putExtra("spagetti", "UN");
                next.putExtra("spagetti", "DOMATES");
                next.putExtra("spagetti", "SALATALIK");
                next.putExtra("spagetti", "TURŞU");
                next.putExtra("spagetti", "GÖBEK");

                startActivity(next);
                finish();
            }
        });

    }
}