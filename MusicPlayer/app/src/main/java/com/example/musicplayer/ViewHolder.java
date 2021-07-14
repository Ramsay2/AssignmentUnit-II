package com.example.musicplayer;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {


    private ItemClickListener itemClickListener;
    private ImageView play, pause, delete;

    public ViewHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        play = itemView.findViewById(R.id.iLPlay);
        pause = itemView.findViewById(R.id.iLPause);
        delete = itemView.findViewById(R.id.iLDelete);
    }

    public void setData(Music music) {
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClick(music, play);
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClick(music, pause);
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClick(music, delete);
            }
        });
    }
}
