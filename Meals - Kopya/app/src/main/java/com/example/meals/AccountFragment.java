package com.example.meals;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class AccountFragment extends Fragment {

    private ImageView cikis,hesabim,siparislerim;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_account, container, false);

        cikis=view.findViewById(R.id.cikis);
        hesabim=view.findViewById(R.id.hesabim);
        siparislerim=view.findViewById(R.id.siparislerim);

        cikis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getActivity(),MainActivity.class);
                startActivity(intent);

            }
        });

        siparislerim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return view;
    }
}