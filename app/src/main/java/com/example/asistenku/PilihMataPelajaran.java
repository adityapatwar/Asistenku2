package com.example.asistenku;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class PilihMataPelajaran extends Fragment {


    public PilihMataPelajaran() {
        // Required empty public constructor
    }

    List<MataPelajaran> mataPelajarans;
    ListView listView;
    View rootView;

    RecyclerView recyclerView;

    RecyclerView.LayoutManager layoutManager;
    Context context;
    List<MataPelajaran> listpelajaran;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_pilih_mata_pelajaran, container, false);

//        mataPelajarans = new ArrayList<> ();
//        listView =(ListView)rootView.findViewById(R.id.listView);
//        mataPelajarans.add(new MataPelajaran ("Matematika", R.drawable.icon_math ));
//        mataPelajarans.add(new MataPelajaran ("B.Inggris", R.drawable.icon_math ));
//        mataPelajarans.add(new MataPelajaran ("B.Indonesia", R.drawable.icon_math ));
//        AdapterFragmentPelajaran adapter = new AdapterFragmentPelajaran(getActivity (), R.layout.activity_custom_listview_matapelajaran, mataPelajarans);
//        listView.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated (view, savedInstanceState);

        listpelajaran = new ArrayList<> ();
        context = getActivity ();
        recyclerView = view.findViewById (R.id.listView);
        layoutManager = new LinearLayoutManager (context);
        recyclerView.setLayoutManager (layoutManager);
        listpelajaran.add(new MataPelajaran ("Matematika", R.drawable.icon_math ));
        listpelajaran.add(new MataPelajaran ("B.Inggris", R.drawable.icon_math ));
        listpelajaran.add(new MataPelajaran ("B.Indonesia", R.drawable.icon_math ));
        listpelajaran.add(new MataPelajaran ("Matematika", R.drawable.icon_math ));
        listpelajaran.add(new MataPelajaran ("B.Inggris", R.drawable.icon_math ));
        listpelajaran.add(new MataPelajaran ("B.Indonesia", R.drawable.icon_math ));
        listpelajaran.add(new MataPelajaran ("Matematika", R.drawable.icon_math ));
        listpelajaran.add(new MataPelajaran ("B.Inggris", R.drawable.icon_math ));
        listpelajaran.add(new MataPelajaran ("B.Indonesia", R.drawable.icon_math ));

        PilihpelajaranAdapter adapter = new PilihpelajaranAdapter(getActivity (),listpelajaran);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }




}
