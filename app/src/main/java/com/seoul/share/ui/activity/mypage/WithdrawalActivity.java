package com.seoul.share.ui.activity.mypage;

import android.content.Intent;
import android.view.View;

import com.seoul.share.databinding.ActivityWithdrawalBinding;
import com.seoul.share.ui.activity.auth.WithdrawalPhoneAuthActivity;
import com.seoul.share.ui.base.BaseActivity;

public class WithdrawalActivity extends BaseActivity<ActivityWithdrawalBinding> {
    @Override
    protected ActivityWithdrawalBinding getBinding() {
        return ActivityWithdrawalBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setOnCreate() {
        binding.tvGoToTheBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        binding.btnWithDrawalSend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(WithdrawalActivity.this, WithdrawalPhoneAuthActivity.class));
            }
        });
    }

}
