package com.example.dd.utils;

public interface RelCallBack<B> {
    void onSucess(B b);
    void onFail(String error);
}
