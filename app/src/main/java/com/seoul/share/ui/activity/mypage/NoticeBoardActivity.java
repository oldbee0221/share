package com.seoul.share.ui.activity.mypage;

import android.view.View;

import com.seoul.share.databinding.ActivityNoticeboardBinding;
import com.seoul.share.ui.adapter.NoticeBoardListAdapter;
import com.seoul.share.ui.base.BaseActivity;

public class NoticeBoardActivity extends BaseActivity<ActivityNoticeboardBinding> {
    @Override
    protected ActivityNoticeboardBinding getBinding() {
        return ActivityNoticeboardBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setOnCreate() {
        binding.rvNoticeBoardList.setAdapter(new NoticeBoardListAdapter());
        binding.tvGoToTheBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
