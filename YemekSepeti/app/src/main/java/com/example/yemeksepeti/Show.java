package com.example.yemeksepeti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import domain.FoodDamain;

public class Show extends AppCompatActivity {

    private TextView titletxt,feetxt,desc,numberr;
    private ImageView arti,eksi,showimage;
    private int number=1;
    private FoodDamain object;
    private ArrayList<FoodDamain> aray=new ArrayList<>();
    private Button sepet;
   private Boolean aBoolean=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        initView();
        getBundle();
    }

    private void getBundle() {

        object=(FoodDamain) getIntent().getSerializableExtra("object");

      showimage.setImageResource(this.getResources().getIdentifier(object.getPic(),"drawable",this.getPackageName()));

      titletxt.setText(object.getTitle());
      feetxt.setText(object.getFee()+"TL");
      desc.setText(object.getDescription());


      arti.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              number+=1;
              numberr.setText(String.valueOf(number));
          }
      });


      eksi.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              number-=1;
              numberr.setText(String.valueOf(number));
          }
      });


     sepet.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {


              Toast.makeText(getApplicationContext(),object.getTitle().toString()+"sepete eklendi",Toast.LENGTH_SHORT).show();
              Intent intent=new Intent(Show.this,CardGec.class);
              startActivity(intent);


          }
      });
    }



    private void initView() {

        titletxt=findViewById(R.id.titletxt);
        feetxt=findViewById(R.id.feetxt);
        desc=findViewById(R.id.descriptiontxt);
        arti=findViewById(R.id.arti);
        eksi=findViewById(R.id.eksi);
        showimage=findViewById(R.id.showimage);
        numberr=findViewById(R.id.numberr);
        sepet=findViewById(R.id.butonsepet);
    }
}