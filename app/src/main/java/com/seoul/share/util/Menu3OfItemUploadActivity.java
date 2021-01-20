package com.seoul.share.util;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.seoul.share.R;
import com.seoul.share.databinding.ActivityMenu3OfItemUploadBinding;
import com.seoul.share.util.adapter.Menu3OfItemUploadImageAdapter;

public class Menu3OfItemUploadActivity extends AppCompatActivity {

    private ActivityMenu3OfItemUploadBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenu3OfItemUploadBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setAdapter();
        clickEvent();
    }


    private void setAdapter() {
        binding.rvUploadImageList.setAdapter(new Menu3OfItemUploadImageAdapter());
    }

    private void clickEvent() {
        binding.tvClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        binding.btnUpLoadCheck.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Menu3OfItemUploadActivity.this,
                        RentalDecisionActivity.class));
            }
        });
    }

}