package com.example.asistenku;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

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
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_pilih_mata_pelajaran, container, false);


        mataPelajarans = new ArrayList<> ();
        listView =(ListView)rootView.findViewById(R.id.listView);

        mataPelajarans.add(new MataPelajaran ("Matematika", R.drawable.icon_math ));

        AdapterFragmentPelajaran adapter = new AdapterFragmentPelajaran(getActivity (), R.layout.activity_custom_listview_matapelajaran, mataPelajarans);

        listView.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }


//    private ArrayList<MataPelajaran> GetlistContact(){
//        ArrayList<MataPelajaran> contactlist = new ArrayList<MataPelajaran>();
//
//        contactlist.add(new MataPelajaran ( "Matematika",R.drawable.icon_math));
//
//        return contactlist;
//    }

}
