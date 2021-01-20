package com.seoul.share.util;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.seoul.share.databinding.ActivityNotificationBinding;
import com.seoul.share.util.adapter.NotificationAdapter;


public class NotificationActivity extends AppCompatActivity {

    private ActivityNotificationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNotificationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.rvNotificationList.setAdapter(new NotificationAdapter());

        binding.ivClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}