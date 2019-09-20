package com.example.asistenku;


import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Home_Page extends Fragment {


    public Fragment_Home_Page() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);

    }
    HorizontalScrollView hv;
    LinearLayout slide1,slide2,slide3;
    RecyclerView recyclerView;
    ConstraintLayout cl,cl2;
    TextView tview;
    ImageView iview;
    RecyclerView.LayoutManager layoutManager;
    Context context;
    List<Siswa> listPersonInfo;


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated (view, savedInstanceState);



        ImageView iv_MasukKelas = (ImageView) view.findViewById (R.id.iv_masukkelas);
        iv_MasukKelas.setOnClickListener (new View.OnClickListener() {
            public void onClick(View view) {
            Intent masukKelas = new Intent (getActivity (),pilihMataPelajaranA.class);
            startActivity (masukKelas);

            }
        });

        ImageView iv_Daftartugass = (ImageView) view.findViewById (R.id.iv_daftartugas);
        iv_Daftartugass.setOnClickListener (new View.OnClickListener() {
            public void onClick(View view) {
                onButtonClick(view);
            }
        });

        ImageView iv_Nilai = (ImageView) view.findViewById (R.id.iv_nilai);
        iv_Nilai.setOnClickListener (new View.OnClickListener() {
            public void onClick(View view) {
                onButtonClick(view);
            }
        });

        ImageView iv_Ruangdiskusi = (ImageView) view.findViewById (R.id.iv_ruangdiskusi);
        iv_Ruangdiskusi.setOnClickListener (new View.OnClickListener() {
            public void onClick(View view) {
                onButtonClick(view);
            }
        });

        hv = view.findViewById (R.id.horizontalScrollView2);
        slide1 = view.findViewById (R.id.itemSlid);
        slide2 = view.findViewById (R.id.itemSlid1);
        slide3 = view.findViewById (R.id.itemSlid2);

        iview = view.findViewById (R.id.iv_lihatabsen);
        tview = view.findViewById (R.id.tv_lihatabsen);
        cl = view.findViewById (R.id.cl_bottom);
        cl2 = view.findViewById (R.id.cl_top);

        listPersonInfo = new ArrayList<> ();
        context = getActivity ();
        recyclerView = view.findViewById (R.id.rv_absen);
        layoutManager = new LinearLayoutManager (context);
        recyclerView.setLayoutManager (layoutManager);
        listPersonInfo.add(new Siswa ("Aditya", "Hadir" ));
        listPersonInfo.add(new Siswa ("Aditya", "Hadir" ));
        listPersonInfo.add(new Siswa ("Aditya", "Hadir" ));
        listPersonInfo.add(new Siswa ("Aditya", "Hadir" ));
        listPersonInfo.add(new Siswa ("Aditya", "Hadir" ));
        listPersonInfo.add(new Siswa ("Aditya", "Hadir" ));
        listPersonInfo.add(new Siswa ("Aditya", "Hadir" ));
        listPersonInfo.add(new Siswa ("Aditya", "Hadir" ));
        listPersonInfo.add(new Siswa ("Aditya", "Hadir" ));
        SiswaAdapter adapter = new SiswaAdapter(getActivity (),listPersonInfo);
        recyclerView.setAdapter(adapter);

        init (cl);
        viewmuncul (cl2,cl);
        viewmuncul (iview,cl);
        viewmuncul (tview,cl);

    }

    private void init(View info){
        info.setVisibility (View.GONE);
        info.setAlpha(0);
        info.setTranslationY(-100);
    }

    private void viewmuncul(final View v,final View muncul){
        v.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                muncul.setVisibility (View.VISIBLE);
                muncul.animate().alpha(1).translationY(0).setDuration(800).start();
                viewilang (v,muncul);
            }
        });
    }

    private void viewilang(final View v,final View ilang)
    {
        v.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                ilang.animate().alpha(0).translationY(-100).setDuration(800).start();
                Handler hand =  new Handler ();
                Runnable nyaa =  new Runnable () {
                    @Override
                    public void run() {
                        ilang.setVisibility (View.GONE);
                    }
                };
                hand.postDelayed (nyaa,900);
                viewmuncul(v,ilang);
//
            }
        });
    }

//
//    private void delay(){
//        new Handler ().postDelayed(new Runnable() {
//            @RequiresApi(api = Build.VERSION_CODES.M)
//            @Override
//            public void run() {
//
//            }
//        },1000);
//    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void scroll(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



        View view = inflater.inflate (R.layout.fragment_fragment__home__page, null, false);



        return view;
    }

    public void onButtonClick(View v) {
        Fragment fg;

        switch (v.getId()) {
            case R.id.iv_masukkelas:
                fg= new PilihMataPelajaran ();
                replaceFragment(fg);
                break;
        }
    }



    private void replaceFragment(Fragment newFragment) {
        FragmentTransaction trasection = getFragmentManager ().beginTransaction ();

        getFragmentManager ().beginTransaction ();
        trasection.replace (R.id.fragment_container, newFragment);
        trasection.setCustomAnimations (R.anim.fadein, R.anim.fadein );
        trasection.addToBackStack (null);
        trasection.commit ();

        }
    }



