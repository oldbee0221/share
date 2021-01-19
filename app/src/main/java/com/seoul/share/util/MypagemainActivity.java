package com.seoul.share.util;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.seoul.share.R;
import com.seoul.share.databinding.ActivityMypagemainBinding;

public class MypagemainActivity extends AppCompatActivity {
        private ActivityMypagemainBinding binding;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                binding = ActivityMypagemainBinding.inflate(getLayoutInflater());
                setContentView(binding.getRoot());
        }
        }