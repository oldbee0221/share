package com.seoul.share.ui.activity.auth;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.seoul.share.databinding.ActivityWithdrawalCompleteBinding;
import com.seoul.share.ui.activity.MainActivity;
import com.seoul.share.ui.base.BaseActivity;

public class WithdrawalCompleteActivity extends BaseActivity<ActivityWithdrawalCompleteBinding> {
    @Override
    protected ActivityWithdrawalCompleteBinding getBinding() {
        return ActivityWithdrawalCompleteBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setOnCreate() {

        binding.btnGoToTheMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(WithdrawalCompleteActivity.this, "회원 탈퇴 되었습니다. 홈으로 이동",
                        Toast.LENGTH_SHORT).show();
                startActivity(new Intent(WithdrawalCompleteActivity.this, MainActivity.class));
            }
        });
    }
}
