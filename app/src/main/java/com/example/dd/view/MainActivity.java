package com.example.dd.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.dd.R;
import com.example.dd.adapter.RelAdapter;
import com.example.dd.base.BaseActivity;
import com.example.dd.bean.NewsBean;
import com.example.dd.contract.RelContract;
import com.example.dd.presenter.ImpPresenter;
import com.example.dd.utils.URLConstant;

import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity<ImpPresenter> implements RelContract.RelView<NewsBean> {
    private RecyclerView rcy;
    private ArrayList<NewsBean.NewsDTO> list;
    private RelAdapter myAdapter;

    @Override
    protected void initData() {
        presenter.getData(URLConstant.NEWSLIST);
    }

    @Override
    protected void initView() {
        rcy = findViewById(R.id.rcy);
        rcy.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();
        myAdapter = new RelAdapter(list, this);
        rcy.setAdapter(myAdapter);
    }


    @Override
    protected ImpPresenter getPresenter() {
        return new ImpPresenter(this);
    }

    @Override
    protected int getContenrById() {
        return R.layout.activity_main;
    }

    @Override
    public void onSucess(NewsBean newsBean) {
        List<NewsBean.NewsDTO> news = newsBean.getNews();
        list.addAll(news);
        myAdapter.notifyDataSetChanged();
    }

    @Override
    public void onFail(String error) {

    }
}