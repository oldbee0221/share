package com.seoul.share.ui.activity.mypage;

import android.view.View;

import com.seoul.share.R;
import com.seoul.share.databinding.ActivityReviewTheContractBinding;
import com.seoul.share.ui.base.BaseActivity;

import static com.seoul.share.ui.activity.mypage.SettingActivity.REVIEW_THE_CONTRACT_MODE;

public class ReviewTheContractActivity extends BaseActivity<ActivityReviewTheContractBinding> {
    @Override
    protected ActivityReviewTheContractBinding getBinding() {
        return ActivityReviewTheContractBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setOnCreate() {
        setData();
        clickEvent();
    }

    private void clickEvent() {
        binding.tvGoToTheBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    private void setData() {
        String currentMode = getIntent().getStringExtra(REVIEW_THE_CONTRACT_MODE);

        if (currentMode.equals("이용약관")) {
            setMode(getString(R.string.termsOfUseTitle), getString(R.string.termsOfUseTitleDescribe));
        } else if (currentMode.equals("개인정보 처리방침")) {
            setMode(getString(R.string.privacyStatementTitle), getString(R.string.privacyStatementDescribe));
        } else {
            setMode(getString(R.string.marketingTitle), getString(R.string.marketingDescribe));
        }
    }

    private void setMode(String currentTitle, String currentDescribe) {
        binding.tvGoToTheBack.setText(currentTitle);
        binding.tvCurrentTitle.setText(currentTitle);
        binding.tvCurrentDescribe.setText(currentDescribe);
    }

}
