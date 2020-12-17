package com.example.dd.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity<P> extends AppCompatActivity {
    protected P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContenrById());
        presenter=getPresenter();

        initView();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract P getPresenter();

    protected abstract int getContenrById();
}






















