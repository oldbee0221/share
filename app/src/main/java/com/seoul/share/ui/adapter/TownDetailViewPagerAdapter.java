package com.seoul.share.ui.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.seoul.share.ui.fragment.TownDetailFragment;
import com.seoul.share.ui.fragment.TownDetailItemDetailFragment;

public class TownDetailViewPagerAdapter extends FragmentStateAdapter {

    TownDetailViewPagerAdapter(FragmentActivity fa){
        super(fa);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1:
                return new TownDetailItemDetailFragment();
            default:
                return new TownDetailFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
