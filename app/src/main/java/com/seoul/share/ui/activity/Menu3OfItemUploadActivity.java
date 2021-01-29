package com.seoul.share.ui.activity;

import android.content.Intent;
import android.view.View;

import com.seoul.share.databinding.ActivityMenu3OfItemUploadBinding;
import com.seoul.share.ui.activity.rental.RentalDecisionActivity;
import com.seoul.share.ui.adapter.Menu3OfItemUploadImageAdapter;
import com.seoul.share.ui.base.BaseActivity;

public class Menu3OfItemUploadActivity extends BaseActivity<ActivityMenu3OfItemUploadBinding> {


    @Override
    protected ActivityMenu3OfItemUploadBinding getBinding() {
        return ActivityMenu3OfItemUploadBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setOnCreate() {
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