package com.example.inshortsnewsapp;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class ViewHolder extends RecyclerView.ViewHolder {
    private ImageView ivImageView;
    private TextView mtvTitle,mtvContent,mtvDate,mtvTime;


    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        ivImageView = itemView.findViewById(R.id.ivImage);
        mtvTitle = itemView.findViewById(R.id.tvTitle);
        mtvContent = itemView.findViewById(R.id.tvContent);
        mtvDate = itemView.findViewById(R.id.tvDate);
        mtvTime = itemView.findViewById(R.id.tvTime);
    }

    public void setData(DataModel dataModel){
        Glide.with(itemView).load(dataModel.getImageUrl()).placeholder(R.drawable.ic_launcher_background).into(ivImageView);
        mtvTitle.setText(dataModel.getTitle());
        mtvContent.setText(dataModel.getContent());
        mtvDate.setText(dataModel.getDate());
        mtvTime.setText(dataModel.getTime());



    }
}
