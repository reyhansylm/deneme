package com.example.yemeksepeti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import adapter.KategoriAdapter;
import adapter.PopularAdapter;
import domain.FoodDamain;
import domain.KtegoriDomain;

public class Home extends AppCompatActivity {

    private RecyclerView.Adapter adapter,adapter2;
    private RecyclerView recyclerViewkategorilist,recyclerViewpop;
    private ArrayList<KtegoriDomain> ktegoriDomainArrayList=new ArrayList<>();
    private ArrayList<FoodDamain> foodDamainArrayList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        recyclerViewkategori();
        recyclerViewPop();

          bottomnav();

    }

    private void recyclerViewPop() {
        LinearLayoutManager linearLayoutManagerr=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewpop=findViewById(R.id.rv2);
        recyclerViewpop.setLayoutManager(linearLayoutManagerr);
        recyclerViewkategorilist.setHasFixedSize(true);
        foodDamainArrayList.add(new FoodDamain("Peporonni Pizza","pepo","Sucuk,sos",20.0,0));
        foodDamainArrayList.add(new FoodDamain("Cheese Burger","chees","chees,soğan",15.0,1));
        foodDamainArrayList.add(new FoodDamain("Coca-Cola","coco","light,orta",6.0,2));
        adapter2=new PopularAdapter(foodDamainArrayList,this);
        recyclerViewpop.setAdapter(adapter2);

    }

    private void recyclerViewkategori() {

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewkategorilist=findViewById(R.id.rv1);
        recyclerViewkategorilist.setLayoutManager(linearLayoutManager);
        recyclerViewkategorilist.setHasFixedSize(true);
        ktegoriDomainArrayList.add(new KtegoriDomain("Pizza","pizzzza"));
        ktegoriDomainArrayList.add(new KtegoriDomain("Hamburger","hamburger"));
        ktegoriDomainArrayList.add(new KtegoriDomain("Donut","donut"));
        ktegoriDomainArrayList.add(new KtegoriDomain("Sosisli","sosisli"));
        adapter=new KategoriAdapter(ktegoriDomainArrayList, this);
        recyclerViewkategorilist.setAdapter(adapter);
    }

    public void bottomnav(){

        FloatingActionButton floatingActionButton=findViewById(R.id.card_btn);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentt=new Intent(Home.this,CardGec.class);
                startActivity(intentt);
            }
        });

    }

}