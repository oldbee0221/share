package com.seoul.share.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.seoul.share.databinding.FragmentMenu5Binding;
import com.seoul.share.ui.activity.NotificationActivity;
import com.seoul.share.ui.base.BaseFragment;

public class Fragment_menu5 extends BaseFragment<FragmentMenu5Binding> {


    @Override
    protected FragmentMenu5Binding getBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentMenu5Binding.inflate(inflater,container,false);
    }

    @Override
    protected void setViewCreated() {
        clickEvent();
    }


    private void clickEvent() {
        binding.ivNotice.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), NotificationActivity.class));
            }
        });
    }
}