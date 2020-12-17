package com.example.dd.contract;

import com.example.dd.utils.RelCallBack;

public class RelContract {
    public interface RelModel<B>{
        void getData(String url, RelCallBack<B> callBack);
    }

    public interface RelPresenter{
        void getData(String url);
    }

    public interface RelView<T>{
        void onSucess(T t);
        void onFail(String error);
    }
}
































