package com.seoul.share.ui.activity.rental;

import android.content.Intent;
import android.view.View;

import com.seoul.share.databinding.ActivityRentalDecisionBinding;
import com.seoul.share.ui.base.BaseActivity;

public class RentalDecisionActivity extends BaseActivity<ActivityRentalDecisionBinding> {


    @Override
    protected ActivityRentalDecisionBinding getBinding() {
        return ActivityRentalDecisionBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setOnCreate() {
        setClickEvent();
    }


    private void setClickEvent() {
        //X 버튼
        binding.ivClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        //대여 시간 설정
        binding.btnRentalTimeSetting.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(binding.tvRentalDay.getVisibility() == View.VISIBLE)
                    binding.tvRentalDay.setVisibility(View.GONE);
                else
                    binding.tvRentalDay.setVisibility(View.VISIBLE);
            }
        });

        //대여 신청하기 버튼
        binding.btnRentalComplete.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                startActivity(new Intent(RentalDecisionActivity.this,
                        RentalDecisionCheckActivity.class));
            }
        });
    }
}