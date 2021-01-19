package com.seoul.share.util;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.seoul.share.R;

public class FInd_pwActivity extends AppCompatActivity {


    Button Find_pw1,Find_pw2,Find_pw3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_pw);


        Find_pw1 = findViewById(R.id.find_pw1);
        Find_pw2 = findViewById(R.id.find_pw2);
        Find_pw3 = findViewById(R.id.find_pw3);



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

        Find_pw1.setOnClickListener(onClickListener);
        Find_pw2.setOnClickListener(onClickListener);
        Find_pw3.setOnClickListener(onClickListener);

    }


}