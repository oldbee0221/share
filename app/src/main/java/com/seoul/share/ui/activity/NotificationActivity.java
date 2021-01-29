package com.seoul.share.ui.activity;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.seoul.share.databinding.ActivityNotificationBinding;
import com.seoul.share.ui.adapter.NotificationAdapter;
import com.seoul.share.ui.base.BaseActivity;


public class NotificationActivity extends BaseActivity<ActivityNotificationBinding> {


    @Override
    protected ActivityNotificationBinding getBinding() {
        return ActivityNotificationBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setOnCreate() {
        binding.rvNotificationList.setAdapter(new NotificationAdapter());

        binding.ivClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }


}