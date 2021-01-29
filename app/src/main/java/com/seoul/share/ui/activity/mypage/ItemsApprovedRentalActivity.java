package com.seoul.share.ui.activity.mypage;

import android.view.View;

import com.seoul.share.databinding.ActivityItemsApprovedRentalBinding;
import com.seoul.share.ui.adapter.ItemsApprovedRentalAdapter;
import com.seoul.share.ui.adapter.ItemsRentalAdapter;
import com.seoul.share.ui.base.BaseActivity;

public class ItemsApprovedRentalActivity extends BaseActivity<ActivityItemsApprovedRentalBinding> {
    @Override
    protected ActivityItemsApprovedRentalBinding getBinding() {
        return ActivityItemsApprovedRentalBinding.inflate(getLayoutInflater());
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
        binding.rvMyItems.setAdapter(new ItemsApprovedRentalAdapter());
    }
}
