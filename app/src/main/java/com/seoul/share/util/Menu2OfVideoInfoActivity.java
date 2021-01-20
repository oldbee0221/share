package com.seoul.share.util;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.seoul.share.databinding.ActivityMenu2OfVideoInfoBinding;
import com.seoul.share.fragment.Menu2Adapter;

public class Menu2OfVideoInfoActivity extends AppCompatActivity {

    private ActivityMenu2OfVideoInfoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenu2OfVideoInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.rvVideoList.setAdapter(new Menu2Adapter());
        clickEvent();
    }

    private void clickEvent() {
        binding.ivNotice.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), NotificationActivity.class));
            }
        });
    }

}