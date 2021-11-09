package com.example.yemeksepeti;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AnaSayfaAdapter extends RecyclerView.Adapter<AnaSayfaAdapter.CardviewNesneTutucu>{

    private Context mcontex;
    private List<CrdViewClass> cardlist;

    public AnaSayfaAdapter(Context mcontex, List<CrdViewClass> cardlist) {
        this.mcontex = mcontex;
        this.cardlist = cardlist;
    }


    @NonNull
    @Override
    public CardviewNesneTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View item= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);

        return new CardviewNesneTutucu(item);
    }

    @Override
    public void onBindViewHolder(@NonNull CardviewNesneTutucu holder, int position) {

        final CrdViewClass yemek=cardlist.get(position);

        holder.fiyat.setText(yemek.getYemekfiyat()+"TL");
        holder.resimad.setText(yemek.getYemekad());
        holder.resim.setImageResource(mcontex.getResources().getIdentifier(yemek.getYemekresimad(),"drawable",mcontex.getPackageName()));
        holder.sepet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mcontex,yemek.getYemekad()+ " sepete eklendi", Toast.LENGTH_SHORT).show();
            }
        });

    }


    public class CardviewNesneTutucu extends RecyclerView.ViewHolder {

       public ImageView resim;
       public Button sepet;
       public TextView fiyat,resimad;

        public CardviewNesneTutucu(@NonNull View itemView) {
            super(itemView);

            resim=itemView.findViewById(R.id.biberdolma);
            resimad=itemView.findViewById(R.id.cardtext);
            sepet=itemView.findViewById(R.id.sepeteekle);
            fiyat=itemView.findViewById(R.id.fiyat);

        }
    }

    @Override
    public int getItemCount() {
        return cardlist.size();
    }
}
