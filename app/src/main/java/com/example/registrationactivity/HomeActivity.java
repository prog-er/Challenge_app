package com.example.registrationactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.home);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.body:
                        startActivity(new Intent(getApplicationContext()
                                ,Body.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.spirit:
                        return true;
                    case R.id.brain:
                        startActivity(new Intent(getApplicationContext()
                                ,Brain.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}