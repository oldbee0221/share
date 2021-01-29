package com.seoul.share.ui.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.seoul.share.ui.fragment.TownDetailFragment;
import com.seoul.share.ui.fragment.TownDetailItemDetailFragment;

public class TownDetailViewPagerAdapter extends FragmentStateAdapter {

    public TownDetailViewPagerAdapter(FragmentActivity fa){
        super(fa);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 1) {
            return new TownDetailItemDetailFragment();
        }
        return new TownDetailFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
