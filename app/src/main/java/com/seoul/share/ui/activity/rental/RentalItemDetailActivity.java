package com.seoul.share.ui.activity.rental;

import android.content.Intent;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import androidx.viewpager2.widget.ViewPager2;

import com.seoul.share.R;
import com.seoul.share.databinding.ActivityRentalItemDetailBinding;
import com.seoul.share.ui.adapter.RentalItemDetailAdapter;
import com.seoul.share.ui.base.BaseActivity;

public class RentalItemDetailActivity extends BaseActivity<ActivityRentalItemDetailBinding> {

    private int[] layouts;

    @Override
    protected ActivityRentalItemDetailBinding getBinding() {
        return ActivityRentalItemDetailBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setOnCreate() {
        setLayouts();
        setUpViewPager();
        clickEvent();
    }


    private void clickEvent() {
        binding.ivBackPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        binding.btnRental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RentalItemDetailActivity.this,
                        RentalDecisionActivity.class));
            }
        });
        binding.tvItemTownName.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RentalItemDetailActivity.this,
                        TownDetailActivity.class
                ));
            }
        });
    }

    private void setUpViewPager() {
        addBottomDots(0);

        binding.vpImageList.setAdapter(new RentalItemDetailAdapter());
        binding.vpImageList.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                addBottomDots(position);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
    }

    private void setLayouts() {
        layouts = new int[]{
                R.layout.activity_tutorialpage1,
                R.layout.activity_tutorialpage2,
                R.layout.activity_tutorialpage3,
        };
    }

    private void addBottomDots(int currentPage) { // 하단 점(선택된 점, 선택되지 않은 점)
        TextView[] dots = new TextView[layouts.length]; // 레이아웃 크기만큼 하단 점 배열에 추가

        binding.liDotList.removeAllViews();
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226;"));
            dots[i].setTextSize(35);
            binding.liDotList.addView(dots[i]);
        }

        if (dots.length > 0)
            dots[currentPage].setTextColor(getResources().getColor(R.color.color_back));
    }
}