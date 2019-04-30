package com.chinaso.baselib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.pics_list_recyler)
    RecyclerView picsListRecyler;
    private Unbinder unBinder;
    List<PicEntity> picsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unBinder = ButterKnife.bind(this);
        initData();
        initView();

    }

    private void initView() {
  //      picsListRecyler=(RecyclerView)findViewById(R.id.pics_list_recyler);
        LinearLayoutManager picLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        picsListRecyler.setLayoutManager(picLayoutManager);
        PicAdapter picAdapter = new PicAdapter(R.layout.list_item_pics, picsList);
        picsListRecyler.setAdapter(picAdapter);
        picAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {

            }
        });
    }

    private void initData() {
        PicEntity entity = new PicEntity();
        entity.setTitle("我是标题");
        entity.setContent("我是内容");
        entity.setDate("2019-04-17");
        entity.setPicUrl("http://img9.daguan.com/group1/M00/20/22/CgrZE1x_GTuAACvXAAD3aFZlInA352.jpg");

        picsList.add(entity);
        picsList.add(entity);
        picsList.add(entity);
        picsList.add(entity);
        picsList.add(entity);
    }
}
