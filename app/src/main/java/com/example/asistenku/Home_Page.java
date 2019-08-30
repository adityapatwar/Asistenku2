package com.example.asistenku;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.MenuItem;
import android.widget.TextView;

public class Home_Page extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    Fragment fg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_home__page);

        BottomNavigationView navView = findViewById (R.id.nav_view);
        navView.setOnNavigationItemSelectedListener (this);
        navView.setSelectedItemId (R.id.navigation_home);
        fg = new Fragment_Home_Page();
        loadFragment (fg);

    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager ()
                    .beginTransaction ()
                    .replace (R.id.fragment_container, fragment)
                    .commit ();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId ()) {
            case R.id.navigation_home:
                fragment = new Fragment_Home_Page ();
                break;

        }
        return loadFragment (fragment);
    }
}
