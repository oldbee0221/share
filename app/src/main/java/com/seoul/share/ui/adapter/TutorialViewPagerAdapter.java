package com.seoul.share.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;


public class TutorialViewPagerAdapter extends PagerAdapter {
    private final int[] layouts;
    private final LayoutInflater mInflater;

    public TutorialViewPagerAdapter(LayoutInflater inflater,int[] layouts) {
        this.layouts = layouts;
        this.mInflater = inflater;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        View view = mInflater.inflate(layouts[position], container, false);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Fragment "+position;
    }
}
