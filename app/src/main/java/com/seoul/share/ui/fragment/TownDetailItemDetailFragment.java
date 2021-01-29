package com.seoul.share.ui.fragment;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.seoul.share.databinding.FragmentTownDetailItemDetailBinding;
import com.seoul.share.ui.base.BaseFragment;

public class TownDetailItemDetailFragment extends BaseFragment<FragmentTownDetailItemDetailBinding> {
    @Override
    protected FragmentTownDetailItemDetailBinding getBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentTownDetailItemDetailBinding.inflate(inflater,container,false);
    }

    @Override
    protected void setViewCreated() {

    }
}
