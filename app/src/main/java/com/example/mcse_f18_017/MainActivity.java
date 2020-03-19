package com.example.mcse_f18_017;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
public class MainActivity extends AppCompatActivity {

    NavigationView  objNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objNavigationView = findViewById(R.id.navigationView);

        objNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if(menuItem.getItemId() == R.id.item_home)
                {

                    Toast.makeText(MainActivity.this, "Home item clicked", Toast.LENGTH_LONG).show();
                    return true;

                }else if(menuItem.getItemId() == R.id.item_search)
                {
                    Toast.makeText(MainActivity.this, "Search item clicked", Toast.LENGTH_LONG).show();
                    return true;
                }
                return false;
            }
        });
    }
}

