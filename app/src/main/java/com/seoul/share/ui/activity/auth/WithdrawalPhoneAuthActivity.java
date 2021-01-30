package com.seoul.share.ui.activity.auth;

import android.content.Intent;
import android.view.View;

import com.seoul.share.databinding.ActivityWithdrawalPhoneAuthBinding;
import com.seoul.share.ui.base.BaseActivity;

public class WithdrawalPhoneAuthActivity extends BaseActivity<ActivityWithdrawalPhoneAuthBinding> {
    @Override
    protected ActivityWithdrawalPhoneAuthBinding getBinding() {
        return ActivityWithdrawalPhoneAuthBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setOnCreate() {

        binding.tvGoToTheBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        binding.btnAuthComplete.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(WithdrawalPhoneAuthActivity.this,
                        WithdrawalCompleteActivity.class));
            }
        });
    }
}
