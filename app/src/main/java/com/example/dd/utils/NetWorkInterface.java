package com.example.dd.utils;

import java.util.HashMap;

public interface NetWorkInterface {
    public <B> void get(String url,RelCallBack<B> callBack);

    public <B> void post(String url,RelCallBack<B> callBack);

    public <B> void psotpar(String url, HashMap<String,String> map, RelCallBack<B> callBack);
}
