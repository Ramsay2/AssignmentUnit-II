package com.example.getlistofalbums;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView mTvTitle;


    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {

        mTvTitle = itemView.findViewById(R.id.tVTitle);


    }

    public void setData(ResponseModel responseModel) {

        mTvTitle.setText(responseModel.getTitle());

    }
}
