package com.seoul.share.ui.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.seoul.share.R;
import com.seoul.share.databinding.ActivityMainBinding;

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

