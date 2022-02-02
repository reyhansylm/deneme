package com.example.meals;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class SiparisFragment extends Fragment {

    private Button siparisbuton,arti,eksi;
    private TextView ad,fiyat,adet;
    private int adett=0,fiyatt;
    private RecyclerView rv;
    private ArrayList<Yemekler> yemekList;
    private Adapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View tasarim=inflater.inflate(R.layout.fragment_siparis, container, false);

        siparisbuton=tasarim.findViewById(R.id.siparisbuton);
        ad=tasarim.findViewById(R.id.yemekad);
        fiyat=tasarim.findViewById(R.id.fiyat);
        arti=tasarim.findViewById(R.id.buttonarti);
        eksi=tasarim.findViewById(R.id.buttoneksi);
        adet=tasarim.findViewById(R.id.adettext);
        rv=tasarim.findViewById(R.id.rvv);

        SiparisFragmentArgs bundle=SiparisFragmentArgs.fromBundle(getArguments());

        Yemekler gelenyemek=bundle.getNesneiki();
         ad.setText(gelenyemek.yemekad);
        fiyat.setText(String.valueOf(gelenyemek.yemekfiyat));



        siparisbuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(),"Siparişiniz Alındı",Toast.LENGTH_LONG).show();
                rv.setHasFixedSize(true);
                rv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
                yemekList=new ArrayList<>();
                yemekList.add(gelenyemek);
                adapter=new Adapter(getActivity(),yemekList);
                rv.setAdapter(adapter);
               /*Intent intent=new Intent(getActivity(),RecView.class);
               startActivity(intent);*/
            }
        });


        eksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adett--;
                adet.setText(String.valueOf(adett));

                if(adett<0){
                    adett=0;
                    adet.setText(String.valueOf(adett));
                }else{
                    fiyatt=gelenyemek.yemekfiyat*adett;
                    fiyat.setText(String.valueOf(fiyatt));
                }
            }
        });
        arti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adett++;
                adet.setText(String.valueOf(adett));

                    fiyatt=gelenyemek.yemekfiyat*adett;
                    fiyat.setText(String.valueOf(fiyatt));



            }
        });

        return tasarim;
    }
}