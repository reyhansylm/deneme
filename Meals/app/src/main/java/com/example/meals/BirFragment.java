package com.example.meals;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Scanner;


public class BirFragment extends Fragment {

    private Button button;
    private TextInputEditText edit,password;
    private SharedPreferences sp;
    private SharedPreferences.Editor editor;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view=inflater.inflate(R.layout.fragment_bir, container, false);

        button=view.findViewById(R.id.giris);
        edit=view.findViewById(R.id.users);
        password=view.findViewById(R.id.parola);


        sp= getContext().getSharedPreferences("GirisBilgi", Context.MODE_PRIVATE);
        editor=sp.edit();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(edit.getText().toString().equals("Reyhan") && password.getText().toString().equals("1234")){

                    editor.putString("username",edit.getText().toString());
                    editor.putString("password",password.getText().toString());
                    editor.commit();

                    String kisi=edit.getText().toString();
                    Intent intent=new Intent(getActivity(),AnaSayfa.class);
                    intent.putExtra("anahtar",kisi);
                    startActivity(intent);

                }
                else{
                    Toast.makeText(getContext(),"Kullanıcı adı veya şifre Hatalı",Toast.LENGTH_LONG).show();
                }




            }
        });



        return view;
    }
}

