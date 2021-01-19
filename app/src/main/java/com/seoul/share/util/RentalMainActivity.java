package com.seoul.share.util;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.seoul.share.R;
import com.seoul.share.databinding.ActivityRentalmainBinding;
import com.seoul.share.databinding.ActivitySearchmainBinding;

public class RentalMainActivity extends AppCompatActivity {

    private ActivityRentalmainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRentalmainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}