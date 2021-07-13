package com.example.gridlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    private ArrayList<Grids> gridList = new ArrayList<>();
    private RecyclerView maRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        buildList();
        setRecyclerView();
    }

    private void buildList() {

        Grids grid1 = new Grids("Books");
        gridList.add(grid1);
        Grids grid2 = new Grids("Podcast");
        gridList.add(grid2);
        Grids grid3 = new Grids("News");
        gridList.add(grid3);
        Grids grid4 = new Grids("Business");
        gridList.add(grid4);
        Grids grid5 = new Grids("Entertainment");
        gridList.add(grid5);
        Grids grid6 = new Grids("Sports");
        gridList.add(grid6);
        Grids grid7 = new Grids("Technology");
        gridList.add(grid7);
        Grids grid8 = new Grids("Pronunciation");
        gridList.add(grid8);
        Grids grid9 = new Grids("Grammar");
        gridList.add(grid9);
        Grids grid10 = new Grids("Health");
        gridList.add(grid10);


    }

    private void setRecyclerView() {
        Adapter adapter = new Adapter(gridList, this);
        GridLayoutManager linearLayoutManager = new GridLayoutManager(this, 2);
        maRecyclerView.setLayoutManager(linearLayoutManager);
        maRecyclerView.setAdapter(adapter);
    }

    private void initView() {
        maRecyclerView = findViewById(R.id.maRecycler);
    }


    @Override
    public void onItemClick(Grids grids, TextView textView) {

        if (((ColorDrawable) textView.getBackground()).getColor() == getResources().getColor(R.color.blue)) {
            textView.setBackground(AppCompatResources.getDrawable(this, R.color.white));
            textView.setTextColor(getResources().getColor(R.color.blue));
        } else {
            textView.setBackground(AppCompatResources.getDrawable(this, R.color.blue));
            textView.setTextColor(getResources().getColor(R.color.white));
        }
    }
}