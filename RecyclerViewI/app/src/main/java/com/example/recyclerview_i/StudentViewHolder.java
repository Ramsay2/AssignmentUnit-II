package com.example.recyclerview_i;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview_i.R;

public class StudentViewHolder extends RecyclerView.ViewHolder {

    private TextView mTvName, mTvAge, mTvRollNo;
    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }
    private void initView(View itemView){
        mTvName = itemView.findViewById(R.id.tvName);
        mTvAge = itemView.findViewById(R.id.tvAge);
        mTvRollNo = itemView.findViewById(R.id.tvRollNo);

    }
    public void setData(Student student){
        mTvName.setText(student.getName());
        mTvAge.setText(student.getAge()+"");
        mTvRollNo.setText(student.getRollNo());
    }
}
