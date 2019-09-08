package com.example.asistenku;


import android.content.Intent;
import android.nfc.Tag;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.text.DecimalFormat;


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

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated (view, savedInstanceState);



        ImageView iv_MasukKelas = (ImageView) view.findViewById (R.id.iv_masukkelas);
        iv_MasukKelas.setOnClickListener (new View.OnClickListener() {
            public void onClick(View view) {

               final Fragment fg= new PilihMataPelajaran ();
                replaceFragment(fg);
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
//        scroll();




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

        //FragmentTransaction trasection =
        getFragmentManager ().beginTransaction ();
        trasection.replace (R.id.fragment_container, newFragment);
        trasection.setCustomAnimations (R.anim.fadein, R.anim.fadein );
        trasection.addToBackStack (null);
        trasection.commit ();


        }
    }



