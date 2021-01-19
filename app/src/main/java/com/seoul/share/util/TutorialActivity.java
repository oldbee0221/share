package com.seoul.share.util;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.seoul.share.R;
import com.seoul.share.databinding.ActivityTutorialBinding;
import com.seoul.share.deprecated.LoginActivity;
import com.seoul.share.lib.Preference;

public class TutorialActivity extends AppCompatActivity {

    public static Object Context;
    private ViewPagerAdapter pagerAdapter;
    private LinearLayout dotsLayout;
    private TextView[] dots;
    private int[] layouts;

    private ActivityTutorialBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTutorialBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }





// 변화될 레이아웃들 주소
        layouts = new int[]{
                R.layout.activity_tutorialpage1,
                R.layout.activity_tutorialpage2,
                R.layout.activity_tutorialpage3,
        };

        addBottomDots(0);

        changeStatusBarColor();

        pagerAdapter  = new ViewPagerAdapter(getLayoutInflater());
        binding.viewPager.setAdapter(pagerAdapter);
        binding.viewPager.addOnPageChangeListener(viewPagerPageChangeListener);

        binding.btnSkip.setOnClickListener(new View.OnClickListener() { // 건너띄기 버튼 클릭시 메인화면으로 이동
            @Override
            public void onClick(View v) {
                moveMainPage();
            }
        });

        binding.btnNext.setOnClickListener(new View.OnClickListener() { // 하나의 버튼을 이용하기 때문에 if else로 두가지 동작을 하게 만듬
            @Override
            public void onClick(View v) {
                int current = getItem(+1);
                if (current < layouts.length) {
//                    마지막 페이지가 아니라면 다음 페이지로 이동
                    binding.viewPager.setCurrentItem(current);
                } else {
//                마지막 페이지라면 메인페이지로 이동
                    moveMainPage();
                }
            }
        });
    }

    private void addBottomDots(int currentPage) { // 하단 점(선택된 점, 선택되지 않은 점)
        dots = new TextView[layouts.length]; // 레이아웃 크기만큼 하단 점 배열에 추가

        int[] colorsActive = getResources().getIntArray(R.array.array_dot_active);
        int[] colorsInactive = getResources().getIntArray(R.array.array_dot_inactive);

        dotsLayout.removeAllViews();
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226;"));
            dots[i].setTextSize(35);
            dotsLayout.addView(dots[i]);
        }

        if (dots.length > 0)
            dots[currentPage].setTextColor(getResources().getColor(R.color.color_back));
    }

    private int getItem(int i) {
        return binding.viewPager.getCurrentItem() + i;
    }

    private void moveMainPage() {
        Preference.get(TutorialActivity.this).setPreference("TUTORIAL_STATUS" ,true );
        startActivity(new Intent(TutorialActivity.this, LoginActivity.class));
        finish();
    }

    ViewPager.OnPageChangeListener viewPagerPageChangeListener = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageSelected(int position) {
            addBottomDots(position);

//            다음 / 시작 버튼 바꾸기
            if (position == layouts.length - 1) {
//                마지막 페이지에서는 다음 버튼을 시작버튼으로 교체
                binding.btnNext.setText(getString(R.string.start)); // 다음 버튼을 시작버튼으로 글자 교체
                binding.btnSkip.setVisibility(View.GONE);
            } else {
//                마지막 페이지가 아니라면 다음과 건너띄기 버튼 출력
                binding.btnNext.setText(getString(R.string.next));
                binding.btnSkip.setVisibility(View.VISIBLE);
            }
        }

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {

        }

        @Override
        public void onPageScrollStateChanged(int arg0) {

        }
    };

    private void changeStatusBarColor() { // 최상단 바 색 변경
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }
    }

    public class ViewPagerAdapter extends PagerAdapter {
        private LayoutInflater mInflater;

        public ViewPagerAdapter(LayoutInflater inflater) {
            this.mInflater = inflater;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {

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

}