package com.seoul.share.util;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.seoul.share.databinding.ActivityMenu4OfChatBinding;

public class Menu4OfChatActivity extends AppCompatActivity {

    private ActivityMenu4OfChatBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenu4OfChatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}