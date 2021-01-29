package com.seoul.share.ui.activity.auth;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.seoul.share.R;
import com.seoul.share.databinding.ActivityCompletedPwBinding;
import com.seoul.share.ui.base.BaseActivity;

public class Completed_pwActivity extends BaseActivity<ActivityCompletedPwBinding> {


    @Override
    protected ActivityCompletedPwBinding getBinding() {
        return ActivityCompletedPwBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setOnCreate() {
        Button.OnClickListener onClickListener = new Button.OnClickListener() {

            @Override
            public void onClick(View view) {

                switch (view.getId()){
                    //첫번째 버튼 행동
                    case R.id.completed_button1:
                        Intent intent = new Intent(Completed_pwActivity.this, LoginActivity.class);
                        startActivity(intent);
                        break;
                    //두번째 버튼 행동

                }
            }
        };

        binding.completedButton1.setOnClickListener(onClickListener);
    }


}