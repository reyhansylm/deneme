package com.example.meals;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class AsilFragment extends Fragment {

    private ImageView hamburger,pizza,noodle,taco,cupcake,sosisli;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_asil, container, false);


        hamburger=view.findViewById(R.id.hambruger);
        pizza=view.findViewById(R.id.pizza);
        sosisli=view.findViewById(R.id.sosisli);
        noodle=view.findViewById(R.id.noodle);
        taco=view.findViewById(R.id.taco);
        cupcake=view.findViewById(R.id.cupcake);



        hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Yemekler yemekler=new Yemekler("Hamburger",20,"hamburger");
                navigateFragment(view,yemekler);


            }
        });

        sosisli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Yemekler yemekler=new Yemekler("Sosisli",15,"sosisli");
                navigateFragment(view,yemekler);
            }
        });

        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Yemekler yemekler=new Yemekler("Pizza",13, "pizza");
                navigateFragment(view,yemekler);

            }
        });

        cupcake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Yemekler yemekler=new Yemekler("Cupcake",10,"cupcake");
                navigateFragment(view,yemekler);



            }
        });

        taco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Yemekler yemekler=new Yemekler("Taco",9,"taco");
                navigateFragment(view,yemekler);

            }
        });

        noodle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Yemekler yemekler=new Yemekler("Noodle",16,"noodle");
                navigateFragment(view,yemekler);

            }
        });
        return view;
    }

    private void navigateFragment(View view, Yemekler yemekler){
        AsilFragmentDirections.Anasaydayagecis gecis=AsilFragmentDirections.anasaydayagecis(yemekler);
        Navigation.findNavController(view).navigate(gecis);
    }

}