package com.seoul.share.ui.fragment;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.seoul.share.databinding.FragmentMenu5Binding;
import com.seoul.share.ui.activity.mypage.ItemManagementActivity;
import com.seoul.share.ui.activity.mypage.ItemsApprovedRentalActivity;
import com.seoul.share.ui.activity.mypage.ItemsRentalActivity;
import com.seoul.share.ui.activity.NotificationActivity;
import com.seoul.share.ui.activity.mypage.ProfileEditActivity;
import com.seoul.share.ui.activity.mypage.WishedItemActivity;
import com.seoul.share.ui.base.BaseFragment;

public class FragmentMenu5 extends BaseFragment<FragmentMenu5Binding> {


    @Override
    protected FragmentMenu5Binding getBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentMenu5Binding.inflate(inflater, container, false);
    }

    @Override
    protected void setViewCreated() {
        clickEvent();
    }


    private void clickEvent() {
        binding.ivNotice.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), NotificationActivity.class));
            }
        });
        binding.ivGoToTheProfileEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), ProfileEditActivity.class));
            }
        });
        binding.layoutItemsRental.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), ItemsRentalActivity.class));
            }
        });

        binding.layoutItemsApprovedRental.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), ItemsApprovedRentalActivity.class));
            }
        });


        binding.layoutLikeItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), WishedItemActivity.class));
            }
        });

        binding.layoutManageMyItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), ItemManagementActivity.class));
            }
        });
    }
}