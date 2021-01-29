package com.seoul.share.ui.activity.mypage;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.seoul.share.databinding.ActivityPersonalinquiryBinding;
import com.seoul.share.ui.activity.MainActivity;
import com.seoul.share.ui.base.BaseActivity;

public class PersonalInquiryActivity extends BaseActivity<ActivityPersonalinquiryBinding> {
    @Override
    protected ActivityPersonalinquiryBinding getBinding() {
        return ActivityPersonalinquiryBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setOnCreate() {
        clickListeners();
    }

    private void clickListeners() {
        binding.btnInquirySend.setOnClickListener(new View.OnClickListener() {
            /**
             * TODO:변경 예정
             *
             */
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PersonalInquiryActivity.this, MainActivity.class));
                Toast.makeText(PersonalInquiryActivity.this, "문의 보내기 클릭 메인화면으로 이동합니다.", Toast.LENGTH_SHORT).show();
            }
        });

        binding.tvGoToTheBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }


}
