package com.example.dd.model;


import com.example.dd.contract.RelContract;
import com.example.dd.utils.RelCallBack;
import com.example.dd.utils.RetrofitUtils;

public class ImpModel<T> implements RelContract.RelModel<T> {
    @Override
    public void getData(String url, RelCallBack<T> callBack) {
        RetrofitUtils instance = RetrofitUtils.getInstance();
        instance.get(url,callBack);
    }
}
