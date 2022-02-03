package com.example.meals;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class AnaSayfa extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
     private NavigationView navi;
     private TextView hi;
    private SharedPreferences sp;
    private SharedPreferences.Editor editor;
    private String username,password;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this,R.layout.activity_ana_sayfa);

        bottomNavigationView=findViewById(R.id.bottom);
        navi=findViewById(R.id.navi);
        hi=findViewById(R.id.hi);

        sp=getSharedPreferences("GirisBilgi", Context.MODE_PRIVATE);
        editor=sp.edit();

        username=sp.getString("username","kullanıcıyok");
        password=sp.getString("password","sifreyok");


        NavHostFragment navv=(NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView);
        NavigationUI.setupWithNavController(bottomNavigationView,navv.getNavController());
        NavigationUI.setupWithNavController(navi,navv.getNavController());

          String data= getIntent().getStringExtra("anahtar");
          hi.setText("Merhaba " + data);

    }
}