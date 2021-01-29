package com.seoul.share.ui.activity.mypage;

import android.view.View;

import com.seoul.share.databinding.ActivityItemsRentalBinding;
import com.seoul.share.ui.adapter.ItemsRentalAdapter;
import com.seoul.share.ui.base.BaseActivity;

public class ItemsRentalActivity extends BaseActivity<ActivityItemsRentalBinding> {
    @Override
    protected ActivityItemsRentalBinding getBinding() {
        return ActivityItemsRentalBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setOnCreate() {
        setAdapter();
        clickListeners();
    }

    private void clickListeners() {
        binding.ivClose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    private void setAdapter() {
        binding.rvMyItems.setAdapter(new ItemsRentalAdapter());
    }
}
