package com.seoul.share.ui.activity.auth;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.seoul.share.R;
import com.seoul.share.databinding.ActivityLoginBinding;
import com.seoul.share.ui.activity.rental.RentalTownSelectActivity;
import com.seoul.share.ui.base.BaseActivity;


public class LoginActivity extends BaseActivity<ActivityLoginBinding> {


    @Override
    protected ActivityLoginBinding getBinding() {
        return ActivityLoginBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setOnCreate() {
        Button.OnClickListener onClickListener = new Button.OnClickListener() {

            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    //첫번째 버튼 행동
                    case R.id.login_button:
                        Intent intent = new Intent(LoginActivity.this, RentalTownSelectActivity.class);
                        startActivity(intent);
                        break;
                    //두번째 버튼 행동
                    case R.id.login_findpw:
                        Intent intent1 = new Intent(LoginActivity.this, FInd_pwActivity.class);
                        startActivity(intent1);
                        break;
                }
            }
        };

        binding.loginButton.setOnClickListener(onClickListener);
        binding.loginFindpw.setOnClickListener(onClickListener);
    }


}