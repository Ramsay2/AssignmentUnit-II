package com.example.getlistofalbums;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView mTvTitle;
    private TextView mTvId;
    private TextView mTvUserId;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        mTvId = itemView.findViewById(R.id.tvId);
        mTvTitle = itemView.findViewById(R.id.tVTitle);

        mTvUserId = itemView.findViewById(R.id.tVUserId);
    }

    public void setData(ResponseModel responseModel) {
        mTvId.setText(responseModel.getId());
        mTvTitle.setText(responseModel.getTitle());

       mTvUserId.setText(responseModel.getUserId());
    }
}
