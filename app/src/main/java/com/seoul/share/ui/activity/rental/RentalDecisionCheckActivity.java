package com.seoul.share.ui.activity.rental;

import android.content.Intent;
import android.view.View;

import com.seoul.share.databinding.ActivityRentalDecisionCheckBinding;
import com.seoul.share.ui.activity.MainActivity;
import com.seoul.share.ui.base.BaseActivity;

public class RentalDecisionCheckActivity extends BaseActivity<ActivityRentalDecisionCheckBinding> {


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
