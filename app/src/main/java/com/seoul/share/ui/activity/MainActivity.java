package com.seoul.share.ui.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.seoul.share.R;
import com.seoul.share.databinding.ActivityMainBinding;
import com.seoul.share.ui.base.BaseActivity;

public class MainActivity extends BaseActivity<ActivityMainBinding> {

    private ActivityMainBinding binding;

    @Override
    protected ActivityMainBinding getBinding() {
        return ActivityMainBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setOnCreate() {
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

