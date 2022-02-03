package com.example.meals;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.nio.BufferUnderflowException;


public class AnasayfaFragment extends Fragment {

     private Button yemekbuton;
     private TextView yemeginadi,yemeginfiyati;
     private ImageView resim;
     private RadioButton ketcap,mayonez,acisos,sram;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View tasarim=inflater.inflate(R.layout.fragment_anasayfa, container, false);

        yemekbuton=tasarim.findViewById(R.id.yemekbuton);
        yemeginadi=tasarim.findViewById(R.id.yemeginadı);
        yemeginfiyati=tasarim.findViewById(R.id.yemeginfiayati);
        ketcap=tasarim.findViewById(R.id.ketcap);
        acisos=tasarim.findViewById(R.id.acisos);
        mayonez=tasarim.findViewById(R.id.mayonez);
        sram=tasarim.findViewById(R.id.sarmsos);
        resim=tasarim.findViewById(R.id.resim);


        AnasayfaFragmentArgs args=AnasayfaFragmentArgs.fromBundle(getArguments());

        Yemekler gelenyemek=args.getNesne();
        yemeginadi.setText(gelenyemek.yemekad);
        yemeginfiyati.setText(String.valueOf(gelenyemek.yemekfiyat));
        resim.setImageResource(getImageId(gelenyemek.getYemekImageId()));

        yemekbuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AnasayfaFragmentDirections.Siparisgecis gecis=AnasayfaFragmentDirections.siparisgecis(gelenyemek);
                Navigation.findNavController(view).navigate(gecis);
            }
        });
        return tasarim;
    }

    private int getImageId(String imageName){
        return getContext().getResources().getIdentifier("drawable/"+imageName,null,getContext().getPackageName());
    }
}