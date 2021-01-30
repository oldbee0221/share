package com.seoul.share.ui.activity.mypage;

import android.view.View;

import com.seoul.share.databinding.ActivityOpenSourceLicenseBinding;
import com.seoul.share.ui.base.BaseActivity;

public class OpenSourceLicenseActivity extends BaseActivity<ActivityOpenSourceLicenseBinding> {
    @Override
    protected ActivityOpenSourceLicenseBinding getBinding() {
        return ActivityOpenSourceLicenseBinding.inflate(getLayoutInflater());

    }

    @Override
    protected void setOnCreate() {
        binding.tvGoToTheBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
