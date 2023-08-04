package com.jennifer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.snackbar.Snackbar;
import com.jennifer.databinding.ActivityMainBinding;
import com.jennifer.fragments.HomeFragment;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.tbTrip);
        addHomeFragment();
    }

    private void addHomeFragment() {
        getSupportFragmentManager().
                beginTransaction()
                .add(binding.fcvMain.getId(), new HomeFragment()).commit();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.food_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        if (item.getItemId() == R.id.search){
            Snackbar.make(binding.getRoot(), "Search", Snackbar.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == R.id.addCart) {
            Snackbar.make(binding.getRoot(), "Add Cart", Snackbar.LENGTH_SHORT).show();
            return true;
        }else {
            return false;
        }
    }
}