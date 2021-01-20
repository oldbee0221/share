package com.seoul.share.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.seoul.share.databinding.FragmentMenu4Binding;
import com.seoul.share.util.NotificationActivity;

public class Fragment_menu4 extends Fragment {


        private FragmentMenu4Binding binding;

        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
                binding = FragmentMenu4Binding.inflate(inflater,container,false);

                setAdapter();
                clickEvent();

                return binding.getRoot();
        }

        private void setAdapter() {
                binding.rvChatList.setAdapter(new Menu4Adapter());
        }

        ;   private void clickEvent() {
                binding.ivNotice.setOnClickListener(new View.OnClickListener(){

                        @Override
                        public void onClick(View view) {
                                startActivity(new Intent(getContext(), NotificationActivity.class));
                        }
                });
        }
}