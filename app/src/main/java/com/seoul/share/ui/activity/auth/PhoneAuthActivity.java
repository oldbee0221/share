package com.seoul.share.ui.activity.auth;

import android.content.Intent;
import android.view.View;

import com.seoul.share.databinding.ActivityPhoneAuthBinding;
import com.seoul.share.ui.base.BaseActivity;

public class PhoneAuthActivity extends BaseActivity<ActivityPhoneAuthBinding> {
    @Override
    protected ActivityPhoneAuthBinding getBinding() {
        return ActivityPhoneAuthBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setOnCreate() {
        binding.btnAuthComplete.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                /** TODO: 변경 예정*/
                startActivity(new Intent(PhoneAuthActivity.this, ChangePwActivity.class ));
            }
        });
        binding.ivAuthClose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
