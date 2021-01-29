package com.seoul.share.ui.activity.rental;

import android.view.View;

import androidx.annotation.NonNull;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.seoul.share.databinding.ActivityTownDetailBinding;
import com.seoul.share.ui.adapter.TownDetailViewPagerAdapter;
import com.seoul.share.ui.base.BaseActivity;

public class TownDetailActivity  extends BaseActivity<ActivityTownDetailBinding> {
    @Override
    protected ActivityTownDetailBinding getBinding() {
        return ActivityTownDetailBinding.inflate(getLayoutInflater());

    }

    @Override
    protected void setOnCreate() {
        setTabAndVpConfigure();
        clickListeners();
    }

    private void clickListeners() {
        binding.tvGoToTheBack.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    private void setTabAndVpConfigure() {
        binding.vpTownAndItemDeatail.setAdapter(new TownDetailViewPagerAdapter(this));
        new TabLayoutMediator(binding.tabTownAndItemDeatail, binding.vpTownAndItemDeatail,
                new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                if(position == 1 )
                    tab.setText("물품 정보");
                else
                    tab.setText("마을 정보");
            }
        }).attach();
    }
}
