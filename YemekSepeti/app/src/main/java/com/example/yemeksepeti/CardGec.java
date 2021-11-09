package com.example.yemeksepeti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import adapter.CrdgecAdapter;
import domain.FoodDamain;

public class CardGec extends AppCompatActivity {


    private RecyclerView rv3;
    private Button onayla;
    private CrdgecAdapter adapterrv;
    private ArrayList<FoodDamain> foodDamainArrayList=new ArrayList<>();
    private TextView total;

    private FoodDamain foodDamain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_gec);


        rv3=findViewById(R.id.rv3);
        onayla=findViewById(R.id.onayla);
        total=findViewById(R.id.totalfiyat);


onayla.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(CardGec.this, Home.class);
        startActivity(intent);



    }
});

      islemler();



    }

    public void islemler(){

        LinearLayoutManager linearLayoutManagerr=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rv3.setLayoutManager(linearLayoutManagerr);
         rv3.setHasFixedSize(true);

        foodDamainArrayList.add(new FoodDamain("Peporonni Pizza","pepo","Sucuk,sos",20.0,0));
        foodDamainArrayList.add(new FoodDamain("Cheese Burger","chees","chees,soğan",15.0,1));
        foodDamainArrayList.add(new FoodDamain("Coca-Cola","coco","light,orta",6.0,2));


        adapterrv=new CrdgecAdapter(foodDamainArrayList,this);
       rv3.setAdapter(adapterrv);


    }











}