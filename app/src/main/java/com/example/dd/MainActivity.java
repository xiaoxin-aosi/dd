package com.example.dd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rel;
    private ArrayList<NewsBean.NewsDTO> list;
    private RelAdapter relAdapter;
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
        myAdapter = new MyAdapter(list, this);
        rcy.setAdapter(myAdapter);
    }
}