package com.seoul.share.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.seoul.share.databinding.FragmentMenu1Binding;
import com.seoul.share.util.NotificationActivity;
import com.seoul.share.util.RentalTownSelectActivity;

public class Fragment_menu1 extends Fragment {

    private FragmentMenu1Binding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentMenu1Binding.inflate(inflater, container, false);
        setAdapter();
        clickListeners();
        return binding.getRoot();
    }

    private void setAdapter() {
        /** 아시죠우? */
        binding.rvItemExchangeList.setAdapter(new ItemListAdapter());
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