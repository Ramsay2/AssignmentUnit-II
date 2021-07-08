package com.example.recyclerviewitemclick;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {

    private ImageView mIvStudentImg;
    private TextView mTvName, mTvAge, mTvDob,mTvAddress;
    private ItemClickListener itemClickListener;
    private RelativeLayout relativeLayout;

    public StudentViewHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initView(itemView);
    }

    private void initView(View itemView) {
        mIvStudentImg = itemView.findViewById(R.id.ivStudentImg);
        mTvName = itemView.findViewById(R.id.tvName);
        mTvAddress  = itemView.findViewById(R.id.tvAddress);
        mTvDob = itemView.findViewById(R.id.tvDob);
        mTvAge = itemView.findViewById(R.id.tvAge);
        relativeLayout = itemView.findViewById(R.id.relativeLayout);
    }
    public void setData(StudentModel studentModel){
        mIvStudentImg.setImageResource(studentModel.getImageId());
        mTvName.setText(studentModel.getName());
        mTvDob.setText(studentModel.getDOB());
        mTvAddress.setText(studentModel.getAddress());
        mTvAge.setText(studentModel.getAge()+"");
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClick(studentModel,getAdapterPosition());
            }
        });
    }
}
