package com.seoul.share.ui.activity.mypage;

import com.seoul.share.databinding.ActivityItemManagementBinding;
import com.seoul.share.ui.adapter.ItemListAdapter;
import com.seoul.share.ui.base.BaseActivity;

public class ItemManagementActivity extends BaseActivity<ActivityItemManagementBinding> {

    @Override
    protected ActivityItemManagementBinding getBinding() {
        return ActivityItemManagementBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setOnCreate() {
        setAdapter();
    }

    private void setAdapter() {
        binding.rvMyItems.setAdapter(new ItemListAdapter());
    }
}
