package com.example.asistenku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class about_page extends AppCompatActivity  {
    View AboutIkhsan,infoikhsan;
    View AboutAdit,infoadit;
    View AboutAziz,infoaziz;
    View AboutAzriel,infoazriel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_about_page);
        infoikhsan = findViewById(R.id.info1);
        infoadit = findViewById(R.id.info2);
        infoaziz = findViewById(R.id.info3);
        infoazriel = findViewById(R.id.info4);


        init(infoikhsan);
        init(infoadit);
        init(infoaziz);
        init(infoazriel);

        AboutIkhsan = findViewById(R.id.aboutikhsan);
        AboutAdit = findViewById(R.id.aboutadit);
        AboutAziz = findViewById(R.id.aboutaziz);
        AboutAzriel = findViewById(R.id.aboutazril);

        viewmuncul(AboutIkhsan,infoikhsan);
        viewmuncul(AboutAdit,infoadit);
        viewmuncul(AboutAziz,infoaziz);
        viewmuncul(AboutAzriel,infoazriel);



    }

    private void init(View info){
        info.setVisibility (View.GONE);
        info.setAlpha(0);
        info.setTranslationY(-200);
    }

    private void viewmuncul(final View v,final View muncul){
        v.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                muncul.setVisibility (View.VISIBLE);
                muncul.animate().alpha(1).translationY(0).setDuration(800).start();
                viewilang (v,muncul);
                viewilang (muncul,muncul,v);
            }
        });
    }

    private void viewilang(final View v,final View ilang)
    {
        v.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                ilang.animate().alpha(0).translationY(-200).setDuration(800).start();
                Handler hand =  new Handler ();
                Runnable nyaa =  new Runnable () {
                    @Override
                    public void run() {
                        ilang.setVisibility (View.GONE);
                    }
                };
                hand.postDelayed (nyaa,700);
                viewmuncul(v,ilang);
//
            }
        });
    }
    private void viewilang(final View v,final View ilang,final View ikhsan)
    {
        v.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                ilang.animate().alpha(0).translationY(-200).setDuration(800).start();
                Handler hand =  new Handler ();
                Runnable nyaa =  new Runnable () {
                    @Override
                    public void run() {
                        ilang.setVisibility (View.GONE);
                    }
                };
                hand.postDelayed (nyaa,700);
                viewmuncul(ikhsan,ilang);
//
            }
        });
    }
//    @Override
//    public void onClick(View v) {
//        switch(v.getId ()){
//            case R.id.aboutikhsan:
//
//
//        }
//    }

}
