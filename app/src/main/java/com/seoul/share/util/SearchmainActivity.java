package com.seoul.share.util;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.seoul.share.R;
import com.seoul.share.databinding.ActivitySearchmainBinding;

public class SearchmainActivity extends AppCompatActivity {

    private ActivitySearchmainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySearchmainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}