package com.seoul.share.util;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.seoul.share.databinding.ActivityRentalDecisionBinding;

public class RentalDecisionActivity extends AppCompatActivity {

    private ActivityRentalDecisionBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRentalDecisionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

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