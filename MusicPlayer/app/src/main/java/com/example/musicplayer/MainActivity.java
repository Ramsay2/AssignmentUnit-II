package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    private ArrayList<Music> musicList = new ArrayList<>();
    private RecyclerView maRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        buildList();
        setRecyclerView();
    }

    private void setRecyclerView() {
        MusicAdapter musicAdapter = new MusicAdapter(musicList, this);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        maRecyclerView.setLayoutManager(linearLayout);
        maRecyclerView.setAdapter(musicAdapter);
    }

    private void buildList() {

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.song);
    }

    private void initView() {
        maRecyclerView = findViewById(R.id.maRecyclerView);
    }

    @Override
    public void onItemClick(Music music, ImageView imageView) {

    }
}