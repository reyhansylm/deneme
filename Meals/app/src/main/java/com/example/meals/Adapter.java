package com.example.meals;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.CardviewNesneTutucu> {

    private Context mcontex;
    private List<Yemekler> yemekleradapter;

    public Adapter(Context mcontex, List<Yemekler> yemekleradapter) {
        this.mcontex = mcontex;
        this.yemekleradapter = yemekleradapter;
    }

    public class CardviewNesneTutucu extends RecyclerView.ViewHolder{
        public TextView satiryazi,satirfiyat;
        private ImageView gorsel;
        public CardView cardView;

        public CardviewNesneTutucu(View view){
            super(view);

            satiryazi=view.findViewById(R.id.satiryazi);
            satirfiyat=view.findViewById(R.id.satirfiyat);
            gorsel=view.findViewById(R.id.gorsel);
            cardView=view.findViewById(R.id.cardview);
        }
    }
    @NonNull
    @Override
    public CardviewNesneTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemview= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        return new CardviewNesneTutucu(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull CardviewNesneTutucu holder, int position) {
        Yemekler yemek=yemekleradapter.get(position);
        holder.satiryazi.setText(yemek.getYemekad());
        holder.satirfiyat.setText(yemek.getYemekfiyat()+"TL");
        holder.gorsel.setImageResource(mcontex.getResources()
                .getIdentifier(yemek.getYemekImageId(),"drawable",mcontex.getPackageName()));

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return yemekleradapter.size();
    }



}
