package com.example.asistenku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class pilihMataPelajaranA extends AppCompatActivity {
    RecyclerView recyclerView;

    RecyclerView.LayoutManager layoutManager;

    List<MataPelajaran> listpelajaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_pilih_mata_pelajaran);

        listpelajaran = new ArrayList<> ();
        recyclerView = findViewById (R.id.rv_matapelajaran);
        layoutManager = new LinearLayoutManager (this);
        recyclerView.setLayoutManager (layoutManager);
        listpelajaran.add(new MataPelajaran ("Matematika", R.drawable.ic_icon_math ));
        listpelajaran.add(new MataPelajaran ("IPA", R.drawable.ic_icon_ipa ));
        listpelajaran.add(new MataPelajaran ("IPS", R.drawable.ic_icon_ips ));
        listpelajaran.add(new MataPelajaran ("Kimia", R.drawable.ic_icon_kimia ));


        PilihpelajaranAdapter adapter = new PilihpelajaranAdapter(this,listpelajaran);
        recyclerView.setAdapter(adapter);
    }
}
