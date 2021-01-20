package com.seoul.share.util;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;

import androidx.appcompat.app.AppCompatActivity;

import com.seoul.share.databinding.ActivityRentalTownSelectBinding;
import com.seoul.share.util.adapter.RentalTownSelectAdapter;

public class RentalTownSelectActivity extends AppCompatActivity {

    private ActivityRentalTownSelectBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRentalTownSelectBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setAdapter();
        btnClickListeners();

    }

    private void setAdapter() {
        binding.rvTownList.setAdapter(new RentalTownSelectAdapter());
    }

    private void btnClickListeners() {
        binding.btnAvailable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClick(binding.btnAvailable, false);
            }
        });
        binding.btnBooking.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                btnClick(binding.btnBooking, false);
            }
        });
        binding.btnCurrentRental.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                btnClick(binding.btnCurrentRental, false);
            }
        });

        //체크박스 전체 선택
        binding.cbBtnsSelect.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    btnClick(binding.btnAvailable, true);
                    btnClick(binding.btnBooking, true);
                    btnClick(binding.btnCurrentRental, true);
                }
            }
        });

        //뒤로가기 버튼
        binding.tvBackPress.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    private void btnClick(Button button, Boolean cbClick) {
        if (cbClick) {
            button.setSelected(true);
            button.setTextColor(Color.parseColor("#FFFFFF"));
            return;
        }

        if (!button.isSelected()) {
            button.setSelected(true);
            button.setTextColor(Color.parseColor("#FFFFFF"));
        } else {
            button.setSelected(false);
            button.setTextColor(Color.parseColor("#9b9b9b"));
        }
    }
}