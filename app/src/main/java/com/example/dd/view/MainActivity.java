package com.example.dd.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.dd.R;
import com.example.dd.adapter.RelAdapter;
import com.example.dd.bean.NewsBean;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcy;
    private ArrayList<NewsBean.NewsDTO> list;
    private RelAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        rcy = findViewById(R.id.rcy);
        rcy.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();
        myAdapter = new RelAdapter(list, this);
        rcy.setAdapter(myAdapter);
    }
}