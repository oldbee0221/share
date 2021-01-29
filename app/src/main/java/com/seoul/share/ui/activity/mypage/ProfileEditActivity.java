package com.seoul.share.ui.activity.mypage;

import android.view.View;

import com.seoul.share.databinding.ActivityProfileEditBinding;
import com.seoul.share.ui.base.BaseActivity;

public class ProfileEditActivity extends BaseActivity<ActivityProfileEditBinding> {
    @Override
    protected ActivityProfileEditBinding getBinding() {
        return ActivityProfileEditBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setOnCreate() {
        clickListeners();
    }

    private void clickListeners() {
        binding.ivBack.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        binding.btnSave.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                /** TODO: 변경예정 */
                onBackPressed();
            }
        });
    }

}
