package com.example.asistenku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class loginAsistenku extends AppCompatActivity implements View.OnClickListener {
    View about;
    Button login;
    EditText et_sekolah,et_username,et_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_login);


        et_sekolah = findViewById (R.id.et_sekolah);

        about = (View) findViewById (R.id.tv_aboutpage);
        about.setOnClickListener (this);

        login = (Button) findViewById (R.id.tombol_login);
        login.setOnClickListener (this);

        Spinner spinner = findViewById(R.id.spinner_sekolah);
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("SMKN 4 BANDUNG");
        arrayList.add("SMKN 5 BANDUNG");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (this,android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener (new AdapterView.OnItemSelectedListener () {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String namaSekolah = adapterView.getItemAtPosition (i).toString ();
                et_sekolah.setText (namaSekolah);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

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
