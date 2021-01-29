package com.seoul.share.ui.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.seoul.share.databinding.ActivityRentalmainBinding;
import com.seoul.share.ui.base.BaseActivity;

public class RentalMainActivity extends BaseActivity<ActivityRentalmainBinding> {

    private ActivityRentalmainBinding binding;

    @Override
    protected ActivityRentalmainBinding getBinding() {
        return ActivityRentalmainBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setOnCreate() {

    }

}