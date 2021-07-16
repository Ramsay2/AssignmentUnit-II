package com.example.github;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView tvName, tvUserId, tvDetails;


    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        tvName = itemView.findViewById(R.id.tvName);
        tvUserId = itemView.findViewById(R.id.tvLogin);
        tvDetails = itemView.findViewById(R.id.tvDetails);
    }

    public void setData(ResponseModel responseModel) {
        tvName.setText(responseModel.getName());
        tvUserId.setText(String.valueOf(responseModel.getId()));
        tvDetails.setText(responseModel.getGitCommitsUrl());

    }
}
