package com.seoul.share.ui.activity.auth;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.seoul.share.R;
import com.seoul.share.databinding.ActivityFindPwBinding;
import com.seoul.share.ui.base.BaseActivity;

public class FInd_pwActivity extends BaseActivity<ActivityFindPwBinding> {



    @Override
    protected ActivityFindPwBinding getBinding() {
        return ActivityFindPwBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setOnCreate() {
        Button.OnClickListener onClickListener = new Button.OnClickListener() {


            public void onClick(View view) {
                switch (view.getId()){
                    //첫번째 버튼 행동
                    case R.id.find_pw1:

                        break;
                    //두번째 버튼 행동
                    case R.id.find_pw2:

                        break;

                    case R.id.find_pw3:
                        Intent intent3 = new Intent(FInd_pwActivity.this,Completed_pwActivity.class);
                        startActivity(intent3);
                        break;

                }
            }
        };

        binding.findPw1.setOnClickListener(onClickListener);
        binding.findPw2.setOnClickListener(onClickListener);
        binding.findPw3.setOnClickListener(onClickListener);
    }


}