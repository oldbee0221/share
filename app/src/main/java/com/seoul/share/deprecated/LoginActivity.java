package com.seoul.share.deprecated;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.seoul.share.R;
import com.seoul.share.util.FInd_pwActivity;
import com.seoul.share.util.MainActivity;


public class LoginActivity extends AppCompatActivity {

    Button Login_Button, Login_FIndpw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);





        Login_Button = findViewById(R.id.login_button);
        Login_FIndpw = findViewById(R.id.login_findpw);


        Button.OnClickListener onClickListener = new Button.OnClickListener() {

            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    //첫번째 버튼 행동
                    case R.id.login_button:
                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                         startActivity(intent);
                         break;
                    //두번째 버튼 행동
                    case R.id.login_findpw:
                        Intent intent1 = new Intent(LoginActivity.this, FInd_pwActivity.class);
                        startActivity(intent1);
                        break;
                }
            }
        };

        Login_Button.setOnClickListener(onClickListener);
        Login_FIndpw.setOnClickListener(onClickListener);
    }

}