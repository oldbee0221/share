package com.seoul.share.util;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.seoul.share.databinding.ActivityMainBinding;
import com.seoul.share.fragment.Fragment_menu1;
import com.seoul.share.fragment.Fragment_menu2;
import com.seoul.share.fragment.Fragment_menu3;
import com.seoul.share.fragment.Fragment_menu4;
import com.seoul.share.fragment.Fragment_menu5;
import com.seoul.share.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private FragmentManager fragmentManager = getSupportFragmentManager();
    private Fragment_menu1 fragment_menu1 = new Fragment_menu1();
    private Fragment_menu2 fragment_menu2 = new Fragment_menu2();
    private Fragment_menu3 fragment_menu3 = new Fragment_menu3();
    private Fragment_menu4 fragment_menu4 = new Fragment_menu4();
    private Fragment_menu5 fragment_menu5 = new Fragment_menu5();


    Menu menu;
    ArrayList<Integer> selectDrawableList = new ArrayList<Integer>();
    ArrayList<Integer> notSelectDrawableList = new ArrayList<Integer>();
    ArrayList<Integer> drawableList = new ArrayList<Integer>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        menu = binding.navView.getMenu();

        setDrableListData();
        setBottomNavi(binding);
    }// onCreate()..

    private void setDrableListData() {
        notSelectDrawableList.add(R.drawable.home2_);
        notSelectDrawableList.add(R.drawable.use_);
        notSelectDrawableList.add(R.drawable.myproducts2_);
        notSelectDrawableList.add(R.drawable.chat_);
        notSelectDrawableList.add(R.drawable.townpage_);

        selectDrawableList.add(R.drawable.home_);
        selectDrawableList.add(R.drawable.use2_);
        selectDrawableList.add(R.drawable.myproducts_);
        selectDrawableList.add(R.drawable.chat2_);
        selectDrawableList.add(R.drawable.townpage2_);

        drawableList.addAll(notSelectDrawableList);
    }
    
    private void setBottomNavi(ActivityMainBinding binding) {
        binding.navView.setOnNavigationItemSelectedListener(new ItemSelectedListener());
        getSupportFragmentManager().beginTransaction().replace(R.id.layout_main_frame, fragment_menu1).commitAllowingStateLoss();
        binding.navView.setSelectedItemId(R.id.navigation_1);  //선택된 아이템 지정
    }


    class ItemSelectedListener implements BottomNavigationView.OnNavigationItemSelectedListener {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.navigation_1:

                    setIconList(0);
                    setFragment(1);
                    break;


                case R.id.navigation_2:

                    setIconList(1);
                    setFragment(2);
                    break;

                case R.id.navigation_3:
                    setIconList(2);
                    setFragment(3);
                    break;

                case R.id.navigation_4:
                    setIconList(3);
                    setFragment(4);
                    break;


                case R.id.navigation_5:
                    setIconList(4);
                    setFragment(5);
                    break;


            }// switch()..
            return true;
        }

        private void setIconList(int index) {

            drawableList.add(index, selectDrawableList.get(index));

            for (int i = 0; i < menu.size(); i++) {
                if (i != index)
                    drawableList.set(i, notSelectDrawableList.get(i));
            }

            for (int j = 0; j < menu.size(); j++) {
                if (j == index)
                    menu.getItem(j).setIcon(drawableList.get(j));
            }
        }

        private void setFragment(int index) {
            switch (index) {
                case 1:
                    getSupportFragmentManager().beginTransaction().
                            replace(R.id.layout_main_frame, fragment_menu1).commitAllowingStateLoss();
                    break;
                case 2:
                    getSupportFragmentManager().beginTransaction().
                            replace(R.id.layout_main_frame, fragment_menu2).commitAllowingStateLoss();
                    break;
                case 3:
                    getSupportFragmentManager().beginTransaction().
                            replace(R.id.layout_main_frame, fragment_menu3).commitAllowingStateLoss();
                    break;
                case 4:
                    getSupportFragmentManager().beginTransaction().
                            replace(R.id.layout_main_frame, fragment_menu4).commitAllowingStateLoss();
                    break;
                case 5:
                    getSupportFragmentManager().beginTransaction().
                            replace(R.id.layout_main_frame, fragment_menu5).commitAllowingStateLoss();
                    break;
            }


        }

    }// ItemSelectedListener class..


}