package com.seoul.share.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.seoul.share.databinding.FragmentMenu2Binding;
import com.seoul.share.ui.activity.Menu2OfVideoInfoActivity;
import com.seoul.share.ui.activity.NotificationActivity;
import com.seoul.share.ui.adapter.Menu2Adapter;
import com.seoul.share.ui.base.BaseFragment;

public class FragmentMenu2 extends BaseFragment<FragmentMenu2Binding> {


    @Override
    protected FragmentMenu2Binding getBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentMenu2Binding.inflate(inflater,container,false);
    }

    @Override
    protected void setViewCreated() {
        setAdapter();
        clickEvent();
    }


    private void setAdapter() {
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);

        binding.rvVideoList.setLayoutManager(layoutManager);
        binding.rvVideoList.setAdapter(new Menu2Adapter());
    }
    private void clickEvent() {
        binding.ivNotice.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), NotificationActivity.class));
            }
        });

        binding.tvVideoInfomation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), Menu2OfVideoInfoActivity.class));
            }
        });
    }
}