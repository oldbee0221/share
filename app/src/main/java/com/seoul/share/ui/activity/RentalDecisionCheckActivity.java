package com.seoul.share.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.seoul.share.databinding.ActivityRentalDecisionCheckBinding;
import com.seoul.share.ui.base.BaseActivity;

public class RentalDecisionCheckActivity extends BaseActivity<ActivityRentalDecisionCheckBinding> {

    private ActivityRentalDecisionCheckBinding binding;

    @Override
    protected ActivityRentalDecisionCheckBinding getBinding() {
        return  ActivityRentalDecisionCheckBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setOnCreate() {
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
