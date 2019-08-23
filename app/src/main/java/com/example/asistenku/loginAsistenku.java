package com.example.asistenku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginAsistenku extends AppCompatActivity implements View.OnClickListener {
    View about;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_login);
        about = (View) findViewById (R.id.tv_aboutpage);
        about.setOnClickListener (this);

        login = (Button) findViewById (R.id.tombol_login);
        login.setOnClickListener (this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId ()){
            case R.id.tv_aboutpage:
                Intent moveIntent = new Intent(this, about_page.class);
                startActivity(moveIntent);
            break;
            case R.id.tombol_login:
                Intent login = new Intent(this, Home_Page.class);
                startActivity(login);
                finish ();
                break;

        }

    }
}
