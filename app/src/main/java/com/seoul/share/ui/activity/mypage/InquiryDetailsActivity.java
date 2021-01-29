package com.seoul.share.ui.activity.mypage;

import android.content.Intent;
import android.view.View;

import com.seoul.share.databinding.ActivityInquiryDetailsBinding;
import com.seoul.share.ui.adapter.InquiryDetailsAdapter;
import com.seoul.share.ui.base.BaseActivity;

public class InquiryDetailsActivity extends BaseActivity<ActivityInquiryDetailsBinding> {
    @Override
    protected ActivityInquiryDetailsBinding getBinding() {
        return ActivityInquiryDetailsBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setOnCreate() {
        setAdapter();
        listeners();
    }

    private void setAdapter() {
        binding.rvInquiryList.setAdapter(new InquiryDetailsAdapter());
    }

    private void listeners() {
        binding.tvGoToTheBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        binding.btnPersonalInquiry.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(InquiryDetailsActivity.this
                        , PersonalInquiryActivity.class));
            }
        });
    }
}
