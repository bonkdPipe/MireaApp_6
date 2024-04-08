package com.example.mireaapp_6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class NewActivity1 extends AppCompatActivity {

    NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new1);

        navController = Navigation.findNavController(this, R.id.nav_host_fragment2);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("Home");
            BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
            bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
                if (item.getItemId() == R.id.home) {
                    navController.navigate(R.id.blankFragment1);
                    actionBar.setTitle("home");
                } else if (item.getItemId() == R.id.notification) {
                    navController.navigate(R.id.blankFragment2);
                    actionBar.setTitle("Humanity's last hope");
                } else if (item.getItemId() == R.id.settings) {
                    navController.navigate(R.id.blankFragment3);
                    actionBar.setTitle("Cannon");
                }
                return false;
            });
        }
    }
}