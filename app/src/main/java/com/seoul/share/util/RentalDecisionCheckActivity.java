package com.seoul.share.util;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.seoul.share.databinding.ActivityRentalDecisionCheckBinding;

public class RentalDecisionCheckActivity extends AppCompatActivity {

    private ActivityRentalDecisionCheckBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRentalDecisionCheckBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        clickEvent();

    }

    private void clickEvent() {
        //X버튼
        binding.ivClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToTheMain();
            }
        });
        //확인 버튼
        binding.btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToTheMain();
            }
        });
    }

    private void goToTheMain() {
        startActivity(new Intent(RentalDecisionCheckActivity.this,
                MainActivity.class));
    }
}
