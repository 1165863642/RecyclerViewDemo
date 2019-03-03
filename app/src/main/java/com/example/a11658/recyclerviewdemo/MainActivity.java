package com.example.a11658.recyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> mFruitList = new ArrayList<>();
    String[] name = {"苹果", "香蕉", "小红", "小洪", "小赖"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFruit();
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        //test1:
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        //test1: 设置为垂直布局, 没有设置是默认的
//        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        //test2: 3: 一个屏幕分3块  垂直或者水平
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.HORIZONTAL);
        //设置布局管理器
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(mFruitList);
        //设置adapter
        recyclerView.setAdapter(adapter);
        //设置分割线 0为VERTICAL分割线 1为HORIZONTAL
        recyclerView.addItemDecoration(new DividerItemDecoration(this, 1));
        //设置增加或者删除条目的动画
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }

    private void initFruit() {
        for (int i = 0; i < name.length; i++) {
            mFruitList.add(new Fruit(R.drawable.ic_launcher_background, name[i]));
        }
    }
}
