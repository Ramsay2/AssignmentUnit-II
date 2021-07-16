package com.example.retrofit_ii;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PostViewHolder extends RecyclerView.ViewHolder {

    private TextView mTvName, mTvEmail,mTvBody;
    public PostViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        mTvBody = itemView.findViewById(R.id.tvBody);
        mTvEmail = itemView.findViewById(R.id.tvEmail);
        mTvName  = itemView.findViewById(R.id.tvName);
    }
    public void setData(ResponseModel responseModel){
        mTvEmail.setText(responseModel.getEmail());
        mTvName.setText(responseModel.getName());
        mTvBody.setText(responseModel.getBody());
    }
}
