package com.seoul.share.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.seoul.share.databinding.FragmentMenu3Binding;

public class Fragment_menu3 extends Fragment {

    private FragmentMenu3Binding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentMenu3Binding.inflate(inflater,container,false);

        setAdapter();
        return binding.getRoot();
    }

    private void setAdapter() {
        /** 아시죠우? */
        binding.rvItemExchangeList.setAdapter(new ItemListAdapter());
    }
}