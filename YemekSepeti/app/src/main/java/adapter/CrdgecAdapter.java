package adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yemeksepeti.CardGec;
import com.example.yemeksepeti.Crd2;
import com.example.yemeksepeti.R;
import com.example.yemeksepeti.Show;

import java.util.ArrayList;

import domain.FoodDamain;

public class CrdgecAdapter extends RecyclerView.Adapter<CrdgecAdapter.Nesne> {

   ArrayList<FoodDamain> aray;
    Context mcontextt;



    public CrdgecAdapter(ArrayList<FoodDamain> aray, Context mcontextt) {
        this.aray = aray;
        this.mcontextt = mcontextt;
    }

    @NonNull
    @Override
    public Nesne onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_crd2,parent,false);

        return new Nesne(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final Nesne holder, final int position) {

        final FoodDamain domain = aray.get(position);

        holder.gecfiyat.setText(domain.getFee() + "TL");
        holder.titlegec.setText(domain.getTitle());
        holder.gec.setImageResource(mcontextt.getResources().getIdentifier(domain.getPic(), "drawable", mcontextt.getPackageName()));
        holder.buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yeni=new Intent(holder.itemView.getContext(), Crd2.class);
                yeni.putExtra("nesne",aray.get(position));
                holder.itemView.getContext().startActivity(yeni);






            }
        });
    }

    @Override
    public int getItemCount() {
        return aray.size();
    }


    public class Nesne extends RecyclerView.ViewHolder{

           ImageView gec;
           TextView titlegec,gecfiyat,total;
           Button buton;


        public Nesne(@NonNull View itemView) {
            super(itemView);

            gec=itemView.findViewById(R.id.gecpic);
            titlegec=itemView.findViewById(R.id.gectitle);
            total=itemView.findViewById(R.id.gectitle2);
            gecfiyat=itemView.findViewById(R.id.gectitlefiyat);
            buton=itemView.findViewById(R.id.button3);

        }
    }


}

