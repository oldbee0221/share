package com.seoul.share.util;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.seoul.share.R;
import com.seoul.share.databinding.ActivityFindPwBinding;

public class FInd_pwActivity extends AppCompatActivity {


    private ActivityFindPwBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFindPwBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Button.OnClickListener onClickListener = new Button.OnClickListener() {


            public void onClick(View view) {
                switch (view.getId()){
                    //첫번째 버튼 행동
                    case R.id.find_pw1:

                        break;
                    //두번째 버튼 행동
                    case R.id.find_pw2:

                        break;

                    case R.id.find_pw3:
                        Intent intent3 = new Intent(FInd_pwActivity.this,Completed_pwActivity.class);
                        startActivity(intent3);
                        break;



                }
            }
        };

        binding.findPw1.setOnClickListener(onClickListener);
        binding.findPw2.setOnClickListener(onClickListener);
        binding.findPw3.setOnClickListener(onClickListener);

    }


}