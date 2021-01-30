package com.seoul.share.ui.activity.mypage;

import android.view.View;

import com.seoul.share.databinding.ActivityVersionCheckBinding;
import com.seoul.share.ui.base.BaseActivity;

public class VersionCheckActivity extends BaseActivity<ActivityVersionCheckBinding> {
    @Override
    protected ActivityVersionCheckBinding getBinding() {
        return ActivityVersionCheckBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setOnCreate() {
        binding.tvGoToTheBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

}
