package com.seoul.share.ui.activity.mypage;

import android.content.Intent;
import android.view.View;

import com.seoul.share.databinding.ActivitySettingBinding;
import com.seoul.share.ui.activity.auth.FInd_pwActivity;
import com.seoul.share.ui.activity.auth.PhoneAuthActivity;
import com.seoul.share.ui.base.BaseActivity;

public class SettingActivity extends BaseActivity<ActivitySettingBinding> {

    public final static String REVIEW_THE_CONTRACT_MODE = "REVIEW_THE_CONTRACT_MODE";

    @Override
    protected ActivitySettingBinding getBinding() {
        return ActivitySettingBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setOnCreate() {


        binding.tvWithdrawal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(SettingActivity.this,WithdrawalActivity.class));
            }
        });
        binding.tvUserUpdate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(SettingActivity.this, PhoneAuthActivity.class));
            }
        });

        binding.ivVersionCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SettingActivity.this, VersionCheckActivity.class));
            }
        });

        binding.ivOpenSourceLicense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SettingActivity.this, OpenSourceLicenseActivity.class));
            }
        });

        binding.ivTermsOfUse.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingActivity.this, ReviewTheContractActivity.class);
                intent.putExtra(REVIEW_THE_CONTRACT_MODE, "이용약관");
                startActivity(intent);
            }
        });
        binding.ivPrivacyStatement.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingActivity.this, ReviewTheContractActivity.class);
                intent.putExtra(REVIEW_THE_CONTRACT_MODE, "개인정보 처리방침");
                startActivity(intent);
            }
        });
        binding.ivMarketing.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingActivity.this, ReviewTheContractActivity.class);
                intent.putExtra(REVIEW_THE_CONTRACT_MODE, "마케팅");
                startActivity(intent);
            }
        });

    }


}
