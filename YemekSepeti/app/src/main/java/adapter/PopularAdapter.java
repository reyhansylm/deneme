package adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yemeksepeti.R;
import com.example.yemeksepeti.Show;

import java.util.ArrayList;

import domain.FoodDamain;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.NesneTutucuKategori> {

    ArrayList<FoodDamain> ktegoriDomains;
    Context mcontext;


    public PopularAdapter(ArrayList<FoodDamain> ktegoriDomains, Context mcontext) {
        this.ktegoriDomains = ktegoriDomains;
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public NesneTutucuKategori onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View item= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholderpop,parent,false);
        return new NesneTutucuKategori(item);
    }

    @Override
    public void onBindViewHolder(@NonNull final NesneTutucuKategori holder, final int position) {

        final FoodDamain ktegoriDomain=ktegoriDomains.get(position);
        holder.title.setText(ktegoriDomain.getTitle());
        holder.fee.setText(ktegoriDomain.getFee()+"");
        holder.pic.setImageResource(mcontext.getResources().getIdentifier(ktegoriDomain.getPic(),"drawable",mcontext.getPackageName()));
        holder.addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yeni=new Intent(holder.itemView.getContext(), Show.class);
                yeni.putExtra("object",ktegoriDomains.get(position));
                holder.itemView.getContext().startActivity(yeni);
            }
        });
    }



    @Override
    public int getItemCount() {
        return ktegoriDomains.size();
    }


    public class NesneTutucuKategori extends RecyclerView.ViewHolder{
        TextView title,addbtn,fee;
        ImageView pic;

        ConstraintLayout mainlayout;

        public NesneTutucuKategori(@NonNull View itemView) {
            super(itemView);

            title=itemView.findViewById(R.id.titl);
            pic=itemView.findViewById(R.id.piccc);
            mainlayout=itemView.findViewById(R.id.mainlayout);
            addbtn=itemView.findViewById(R.id.addbtn);
            fee=itemView.findViewById(R.id.fee);
        }
    }
}
