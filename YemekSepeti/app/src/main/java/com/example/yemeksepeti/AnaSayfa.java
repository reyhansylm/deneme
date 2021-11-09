package com.example.yemeksepeti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class AnaSayfa extends AppCompatActivity {

    private RecyclerView rv;
    private ArrayList<CrdViewClass> cardlist=new ArrayList<>();
    private AnaSayfaAdapter anaSayfaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_sayfa);

        rv=findViewById(R.id.rv1);
        rv.setHasFixedSize(true);

        rv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

        CrdViewClass a1=new CrdViewClass(1,"Biber Dolması",15,"biberdolma");
        CrdViewClass a2=new CrdViewClass(2,"Güveç",16,"guvec");
        CrdViewClass a3=new CrdViewClass(3,"Kebap",17,"kebap");
        CrdViewClass a4=new CrdViewClass(4,"Köfte",18,"kofte");
        CrdViewClass a5=new CrdViewClass(5,"Mantı",19,"manti");
        CrdViewClass a6=new CrdViewClass(6,"Sarma",20,"sarma");

        cardlist.add(a1);
        cardlist.add(a2);
        cardlist.add(a3);
        cardlist.add(a4);
        cardlist.add(a5);
        cardlist.add(a6);

        anaSayfaAdapter=new AnaSayfaAdapter(this,cardlist);
        rv.setAdapter(anaSayfaAdapter);

    }
}