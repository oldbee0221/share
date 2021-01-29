package com.seoul.share.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.seoul.share.databinding.FragmentMenu3Binding;
import com.seoul.share.ui.activity.Menu3OfItemUploadActivity;
import com.seoul.share.ui.activity.NotificationActivity;
import com.seoul.share.ui.adapter.Menu3ItemListAdapter;
import com.seoul.share.ui.base.BaseFragment;

public class FragmentMenu3 extends BaseFragment<FragmentMenu3Binding> {

    @Override
    protected FragmentMenu3Binding getBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentMenu3Binding.inflate(inflater,container,false);
    }

    @Override
    protected void setViewCreated() {
        setAdapter();
        clickEvent();
    }

    private void setAdapter() {
        /** 아시죠우? */
        binding.rvItemExchangeList.setAdapter(new Menu3ItemListAdapter());
    }
    private void clickEvent() {
        binding.ivNotice.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), NotificationActivity.class));
            }
        });

        //검색 기능 키기
        binding.ivSearch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                binding.layoutSearchBar.setVisibility(View.VISIBLE);
            }
        });

        //검색 기능 끄기
        binding.ivSearchBarClose.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                binding.layoutSearchBar.setVisibility(View.GONE);
            }
        });

        binding.fabItemUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), Menu3OfItemUploadActivity.class));
            }
        });
    }
}