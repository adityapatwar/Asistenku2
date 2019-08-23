package com.example.asistenku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class SplashScreen extends AppCompatActivity {

    View image,atas,bawah;
    private int waktu_loading=2000;
    Animation coba,muncul,blink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_splash_screen);

        inisialisasi();
        animasi();
        splash();

    }

    private void splash() {
        new Handler ().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent home=new Intent(SplashScreen.this, loginAsistenku.class);
                startActivity(home);
                finish();

            }
        },waktu_loading);


    }

    private void animasi() {
        bawah.setAnimation (blink);
        image.setAnimation (coba);
        atas.setAnimation (muncul);

    }

    private void inisialisasi() {
        image = (View) findViewById (R.id.logo);
        atas =(View)findViewById (R.id.backgroundatas);
        bawah =(View)findViewById (R.id.backgroundbawah);

        coba = AnimationUtils.loadAnimation (this,R.anim.coba2);
        muncul = AnimationUtils.loadAnimation (this,R.anim.coba);
        blink = AnimationUtils.loadAnimation (this,R.anim.blink);

    }


}
