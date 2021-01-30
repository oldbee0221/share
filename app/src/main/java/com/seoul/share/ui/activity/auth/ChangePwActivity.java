package com.seoul.share.ui.activity.auth;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.seoul.share.databinding.ActivityPwChangeBinding;
import com.seoul.share.ui.activity.main.MainActivity;
import com.seoul.share.ui.base.BaseActivity;

public class ChangePwActivity extends BaseActivity<ActivityPwChangeBinding> {
    @Override
    protected ActivityPwChangeBinding getBinding() {
        return ActivityPwChangeBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setOnCreate() {


        binding.ivPwChangeCancle.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChangePwActivity.this, MainActivity.class));
                Toast.makeText(ChangePwActivity.this, "비밀번호 변경을 취소, 홈으로 이동",
                        Toast.LENGTH_SHORT).show();
            }
        });
        binding.btnNumberChangeComplete.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                /** TODO:변경 예정*/

                startActivity(new Intent(ChangePwActivity.this, MainActivity.class));
                Toast.makeText(ChangePwActivity.this, "비밀번호 변경 로직 실행 예정",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
