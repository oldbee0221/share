package com.seoul.share.ui.base;

import android.app.Activity;
import android.app.Application;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

public abstract class BaseActivity<VB extends ViewBinding> extends AppCompatActivity {

     protected VB binding;
    protected abstract VB getBinding();
    protected abstract void setOnCreate();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getInitBinding();
        setContentView(binding.getRoot());
        setOnCreate();
    }

    private void getInitBinding(){
        binding = getBinding();
    }


}
