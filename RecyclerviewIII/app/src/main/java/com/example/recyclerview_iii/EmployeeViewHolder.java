package com.example.recyclerview_iii;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EmployeeViewHolder extends RecyclerView.ViewHolder {
    private TextView mTvName, mTvAddress, mTvAge;
    private ImageView mIvEdit;
    private ItemClickListener itemClickListener;



    public EmployeeViewHolder(@NonNull  View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        initData(itemView);
        this.itemClickListener = itemClickListener;
    }

    private void initData(View itemView) {
        mTvAddress = itemView.findViewById(R.id.tvAddress);
        mTvName = itemView.findViewById(R.id.tvName);
        mTvAge = itemView.findViewById(R.id.tvAge);
        mIvEdit = itemView.findViewById(R.id.ivEdit);
    }
    public void setData(Employee employee){
        mTvName.setText(employee.getName());
        mTvAddress.setText(employee.getAddress());
        mTvAge.setText(employee.getAge() +"");
        mIvEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClicked(getAdapterPosition(),employee);
            }
        });

    }
}
