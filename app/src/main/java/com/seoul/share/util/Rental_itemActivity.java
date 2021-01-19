package com.seoul.share.util;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.seoul.share.R;
import com.seoul.share.databinding.ActivityRentalItemBinding;

public class Rental_itemActivity extends AppCompatActivity {

    private ActivityRentalItemBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRentalItemBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}