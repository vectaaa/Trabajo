package com.trabajo.trabajo;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.gadspracticeproject.R;
import com.gadspracticeproject.Trabajo.Adapters.HomeRecyclerAdapter;
import com.gadspracticeproject.Trabajo.Models.HomeJobsModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;


public class HomeActivity extends AppCompatActivity {

    private static final String TAG = "HomeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView navigationView = findViewById(R.id.bottom);
        navigationView.setOnNavigationItemSelectedListener(onNavigationSelected);

        loadFragment(new JobsFragment());

    }

    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationSelected
            = item -> {
                Fragment fragment;
                switch (item.getItemId()){
                    case R.id.jobs:
                        fragment = new JobsFragment();
                        loadFragment(fragment);
                        return  true;
                    case R.id.profile:
                        fragment = new ProfileFragment();
                        loadFragment(fragment);
                        return  true;
                    case R.id.settings:
                        fragment = new SettingsFragment();
                        loadFragment(fragment);
                        return  true;
                }
                return false;
            };
    private void loadFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.home_relative, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}
