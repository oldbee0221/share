package com.seoul.share.ui.activity.mypage;

import android.view.View;

import com.seoul.share.databinding.ActivityNoticeboardDetailBinding;
import com.seoul.share.ui.base.BaseActivity;

public class NoticeBoardDetailActivity extends BaseActivity<ActivityNoticeboardDetailBinding> {
    @Override
    protected ActivityNoticeboardDetailBinding getBinding() {
        return ActivityNoticeboardDetailBinding.inflate(getLayoutInflater());
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
