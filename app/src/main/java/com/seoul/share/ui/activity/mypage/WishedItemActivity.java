package com.seoul.share.ui.activity.mypage;

import com.seoul.share.databinding.ActivityWishedItemBinding;
import com.seoul.share.ui.adapter.ItemListAdapter;
import com.seoul.share.ui.base.BaseActivity;

public class WishedItemActivity extends BaseActivity<ActivityWishedItemBinding> {
    @Override
    protected ActivityWishedItemBinding getBinding() {
        return ActivityWishedItemBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setOnCreate() {
        setAdapter();
    }

    private void setAdapter() {
        binding.rvMyWishedList.setAdapter(new ItemListAdapter());
    }
}
