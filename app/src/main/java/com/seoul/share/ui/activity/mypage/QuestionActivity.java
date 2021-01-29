package com.seoul.share.ui.activity.mypage;

import android.content.Intent;
import android.view.View;

import com.seoul.share.databinding.ActivityQuestionBinding;
import com.seoul.share.ui.adapter.QuestionListAdapter;
import com.seoul.share.ui.base.BaseActivity;

import java.util.ArrayList;

public class QuestionActivity extends BaseActivity<ActivityQuestionBinding> {
    ArrayList<String> mocks = new ArrayList<String>();

    @Override
    protected ActivityQuestionBinding getBinding() {
        return ActivityQuestionBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setOnCreate() {
        setAdapter();
        listeners();
    }

    private void listeners() {
        binding.tvInquiryDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuestionActivity.this
                        , InquiryDetailsActivity.class));
            }
        });
        binding.tvGoToTheBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        binding.btnPersonalInquiry.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuestionActivity.this
                        , PersonalInquiryActivity.class));
            }
        });
    }

    private void setAdapter() {
        /** TODO: 변경예정*/
        mocks.add("대여신청은 아무나 등록 할수 있나요?");
        mocks.add("물품공유서비스는 무슨 서비스 인가요?");
        mocks.add("내 마을물품은 무엇인가요?");
        QuestionListAdapter adapter = new QuestionListAdapter(mocks);
        binding.rvQuestionList.setAdapter(adapter);
    }

}
