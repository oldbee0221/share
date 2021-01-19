package com.seoul.share.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.seoul.share.databinding.FragmentMenu2Binding;

public class Fragment_menu2 extends Fragment {

    private FragmentMenu2Binding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentMenu2Binding.inflate(inflater,container,false);
        setAdapter();

        return binding.getRoot();
    }

    private void setAdapter() {
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);

        binding.rvVideoList.setLayoutManager(layoutManager);
        binding.rvVideoList.setAdapter(new Menu2Adapter());
    }

    ;
}