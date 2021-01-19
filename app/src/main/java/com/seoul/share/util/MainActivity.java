package com.seoul.share.util;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.seoul.share.fragment.Fragment_menu1;
import com.seoul.share.fragment.Fragment_menu2;
import com.seoul.share.fragment.Fragment_menu3;
import com.seoul.share.fragment.Fragment_menu4;
import com.seoul.share.fragment.Fragment_menu5;
import com.seoul.share.R;

public class MainActivity extends AppCompatActivity {


    private BottomNavigationView mBottomNV;

    private DrawerLayout mDrawerLayout = null;
    private View mFragmentContainerView = null;
    private Toolbar mToolbar = null;


    private FragmentManager fragmentManager = getSupportFragmentManager();
    private Fragment_menu1 fragment_menu1 = new Fragment_menu1();
    private Fragment_menu2 fragment_menu2 = new Fragment_menu2();
    private Fragment_menu3 fragment_menu3 = new Fragment_menu3();
    private Fragment_menu4 fragment_menu4 = new Fragment_menu4();
    private Fragment_menu5 fragment_menu5 = new Fragment_menu5();



    Toolbar up_toolbar;
    Menu menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mBottomNV = findViewById(R.id.nav_view);
        menu = mBottomNV.getMenu();


        mBottomNV.setOnNavigationItemSelectedListener(new ItemSelectedListener());
        getSupportFragmentManager().beginTransaction().replace(R.id.layout_main_frame,fragment_menu1).commitAllowingStateLoss();
        mBottomNV.setSelectedItemId(R.id.navigation_1);  //선택된 아이템 지정
    }// onCreate()..

    class ItemSelectedListener implements BottomNavigationView.OnNavigationItemSelectedListener {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.navigation_1:
                    menuItem.setIcon(R.drawable.home_);    // 선택한 이미지 변경
                    menu.findItem(R.id.navigation_2).setIcon(R.drawable.use_);
                    menu.findItem(R.id.navigation_3).setIcon(R.drawable.myproducts2_);
                    menu.findItem(R.id.navigation_4).setIcon(R.drawable.chat_);
                    menu.findItem(R.id.navigation_5).setIcon(R.drawable.townpage_);


                    getSupportFragmentManager().beginTransaction().replace(R.id.layout_main_frame, fragment_menu1).commitAllowingStateLoss();
                    break;



                case R.id.navigation_2:
                    menuItem.setIcon(R.drawable.use2_);    // 선택한 이미지 변경
                    menu.findItem(R.id.navigation_1).setIcon(R.drawable.home2_);
                    menu.findItem(R.id.navigation_3).setIcon(R.drawable.myproducts2_);
                    menu.findItem(R.id.navigation_4).setIcon(R.drawable.chat_);
                    menu.findItem(R.id.navigation_5).setIcon(R.drawable.townpage_);


                    getSupportFragmentManager().beginTransaction().replace(R.id.layout_main_frame, fragment_menu2).commitAllowingStateLoss();
                    break;

                case R.id.navigation_3:
                    menuItem.setIcon(R.drawable.myproducts_);    // 선택한 이미지 변경
                    menu.findItem(R.id.navigation_1).setIcon(R.drawable.home2_);
                    menu.findItem(R.id.navigation_2).setIcon(R.drawable.use_);
                    menu.findItem(R.id.navigation_4).setIcon(R.drawable.chat_);
                    menu.findItem(R.id.navigation_5).setIcon(R.drawable.townpage_);


                    getSupportFragmentManager().beginTransaction().replace(R.id.layout_main_frame, fragment_menu3).commitAllowingStateLoss();
                    break;

                case R.id.navigation_4:
                    menuItem.setIcon(R.drawable.chat2_);    // 선택한 이미지 변경
                    menu.findItem(R.id.navigation_1).setIcon(R.drawable.home2_);
                    menu.findItem(R.id.navigation_2).setIcon(R.drawable.use_);
                    menu.findItem(R.id.navigation_3).setIcon(R.drawable.myproducts2_);
                    menu.findItem(R.id.navigation_5).setIcon(R.drawable.townpage_);

                    getSupportFragmentManager().beginTransaction().replace(R.id.layout_main_frame, fragment_menu4).commitAllowingStateLoss();
                    break;


                case R.id.navigation_5:
                    menuItem.setIcon(R.drawable.townpage2_);    // 선택한 이미지 변경
                    menu.findItem(R.id.navigation_1).setIcon(R.drawable.home2_);
                    menu.findItem(R.id.navigation_2).setIcon(R.drawable.use_);
                    menu.findItem(R.id.navigation_3).setIcon(R.drawable.myproducts2_);
                    menu.findItem(R.id.navigation_4).setIcon(R.drawable.chat_);


                    getSupportFragmentManager().beginTransaction().replace(R.id.layout_main_frame, fragment_menu5).commitAllowingStateLoss();
                    break;


            }// switch()..
            return true;
        }
    }// ItemSelectedListener class..


}