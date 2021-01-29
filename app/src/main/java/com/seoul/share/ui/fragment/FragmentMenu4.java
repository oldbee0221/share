package com.seoul.share.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.seoul.share.databinding.FragmentMenu4Binding;
import com.seoul.share.ui.activity.NotificationActivity;
import com.seoul.share.ui.adapter.Menu4Adapter;
import com.seoul.share.ui.base.BaseFragment;

public class FragmentMenu4 extends BaseFragment<FragmentMenu4Binding> {


    @Override
    protected FragmentMenu4Binding getBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentMenu4Binding.inflate(inflater, container, false);
    }

    @Override
    protected void setViewCreated() {
        setAdapter();
        clickEvent();

    }


    private void setAdapter() {
        binding.rvChatList.setAdapter(new Menu4Adapter());
    }

    private void clickEvent() {
        binding.ivNotice.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), NotificationActivity.class));
            }
        });
    }
}