package com.seoul.share.util;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.seoul.share.R;
import com.seoul.share.databinding.ActivityMainBinding;
import com.seoul.share.fragment.Fragment_menu1;
import com.seoul.share.fragment.Fragment_menu2;
import com.seoul.share.fragment.Fragment_menu3;
import com.seoul.share.fragment.Fragment_menu4;
import com.seoul.share.fragment.Fragment_menu5;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setNavigation();

    }


        private void setNavigation() {
            NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.layout_main_frag);
            assert navHostFragment != null;
            NavigationUI.setupWithNavController(binding.navView, navHostFragment.getNavController());
            binding.navView.setItemIconTintList(null);

        }
    }

