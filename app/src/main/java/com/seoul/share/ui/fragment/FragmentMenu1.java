package com.seoul.share.ui.fragment;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.seoul.share.databinding.FragmentMenu1Binding;
import com.seoul.share.ui.activity.main.NotificationActivity;
import com.seoul.share.ui.adapter.Menu3ItemListAdapter;
import com.seoul.share.ui.base.BaseFragment;

public class FragmentMenu1 extends BaseFragment<FragmentMenu1Binding> {


    @Override
    protected FragmentMenu1Binding getBinding(LayoutInflater inflater, ViewGroup container) {
       return FragmentMenu1Binding.inflate(inflater, container, false);
    }

    @Override
    protected void setViewCreated() {
        setAdapter();
        clickListeners();
    }

    private void setAdapter() {
        /** 아시죠우? */
        binding.rvItemExchangeList.setAdapter(new Menu3ItemListAdapter());
    }

    private void clickListeners() {
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

        //알림 페이지로 이동
        binding.ivNotice.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), NotificationActivity.class));
            }
        });
    }


}