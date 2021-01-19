package com.seoul.share.util;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.seoul.share.R;
import com.seoul.share.databinding.ActivityCompletedPwBinding;
import com.seoul.share.deprecated.LoginActivity;

public class Completed_pwActivity extends AppCompatActivity {

    private ActivityCompletedPwBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCompletedPwBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Button.OnClickListener onClickListener = new Button.OnClickListener() {

            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    //첫번째 버튼 행동
                    case R.id.completed_button1:
                        Intent intent = new Intent(Completed_pwActivity.this, LoginActivity.class);
                        startActivity(intent);
                        break;
                    //두번째 버튼 행동

                }
            }
        };

        binding.completedButton1.setOnClickListener(onClickListener);

    }

}