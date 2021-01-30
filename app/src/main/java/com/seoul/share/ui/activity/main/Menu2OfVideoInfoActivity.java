package com.seoul.share.ui.activity.main;

import android.content.Intent;
import android.view.View;

import com.seoul.share.databinding.ActivityMenu2OfVideoInfoBinding;
import com.seoul.share.ui.adapter.Menu2Adapter;
import com.seoul.share.ui.base.BaseActivity;

public class Menu2OfVideoInfoActivity extends BaseActivity<ActivityMenu2OfVideoInfoBinding> {


    @Override
    protected ActivityMenu2OfVideoInfoBinding getBinding() {
        return ActivityMenu2OfVideoInfoBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setOnCreate() {
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