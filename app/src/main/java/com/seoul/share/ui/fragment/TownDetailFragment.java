package com.seoul.share.ui.fragment;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.seoul.share.databinding.FragmentTownDetailBinding;
import com.seoul.share.ui.base.BaseFragment;

public class TownDetailFragment extends BaseFragment<FragmentTownDetailBinding> {

    @Override
    protected FragmentTownDetailBinding getBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentTownDetailBinding.inflate(inflater,container,false);
    }

    @Override
    protected void setViewCreated() {

    }
}
