package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yemeksepeti.R;

import java.util.ArrayList;

import domain.KtegoriDomain;

public class KategoriAdapter extends RecyclerView.Adapter<KategoriAdapter.NesneTutucuKategori> {

    ArrayList<KtegoriDomain> ktegoriDomains;
    Context mcontext;


    public KategoriAdapter(ArrayList<KtegoriDomain> ktegoriDomains, Context mcontext) {
        this.ktegoriDomains = ktegoriDomains;
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public NesneTutucuKategori onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View item= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholdercard,parent,false);
        return new NesneTutucuKategori(item);
    }

    @Override
    public void onBindViewHolder(@NonNull NesneTutucuKategori holder, int position) {

        final KtegoriDomain ktegoriDomain=ktegoriDomains.get(position);
        holder.cattitle.setText(ktegoriDomain.getTitle());
        holder.catpic.setImageResource(mcontext.getResources().getIdentifier(ktegoriDomain.getPic(),"drawable",mcontext.getPackageName()));
    }



    @Override
    public int getItemCount() {
        return ktegoriDomains.size();
    }


    public class NesneTutucuKategori extends RecyclerView.ViewHolder{
        TextView cattitle;
        ImageView catpic;
        ConstraintLayout mainlayout;

        public NesneTutucuKategori(@NonNull View itemView) {
            super(itemView);

            cattitle=itemView.findViewById(R.id.cattitle);
            catpic=itemView.findViewById(R.id.catpic);
            mainlayout=itemView.findViewById(R.id.mainlayout);
        }
    }
}
