package com.seoul.share.util;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.seoul.share.R;
import com.seoul.share.databinding.ActivityRentalBilligeBinding;

public class Rental_billigeActivity extends AppCompatActivity {

    private ActivityRentalBilligeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRentalBilligeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}