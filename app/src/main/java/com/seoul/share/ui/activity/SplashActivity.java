package com.seoul.share.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.seoul.share.R;
import com.seoul.share.lib.Preference;

public class SplashActivity extends AppCompatActivity {

    private final int SPLASH_DISPLAY_TIME = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run(){


                boolean res = Preference.get(SplashActivity.this).getPreference("TUTORIAL_STATUS" ,false );
                if( !res ) {

                    startActivity(new Intent(getApplication(),  TutorialActivity.class));
                    /* 스플래시 액티비티를 스택에서 제거. */
                    SplashActivity.this.finish();
                } else {
                    startActivity(new Intent(getApplication(),  LoginActivity.class));
                    /* 스플래시 액티비티를 스택에서 제거. */
                    SplashActivity.this.finish();
                }


            }
        }, SPLASH_DISPLAY_TIME);
    }

    @Override
    public void onBackPressed() {
        /* 스플래시 화면에서 뒤로가기 기능 제거. */
    }
}


