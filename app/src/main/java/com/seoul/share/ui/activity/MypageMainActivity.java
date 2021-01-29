package com.seoul.share.ui.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.seoul.share.databinding.ActivityMypagemainBinding;
import com.seoul.share.ui.base.BaseActivity;

public class MypageMainActivity extends BaseActivity<ActivityMypagemainBinding> {

    @Override
    protected ActivityMypagemainBinding getBinding() {
        return ActivityMypagemainBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setOnCreate() {

    }


}