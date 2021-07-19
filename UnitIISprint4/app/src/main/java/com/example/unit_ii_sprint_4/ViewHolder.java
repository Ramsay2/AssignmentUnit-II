package com.example.unit_ii_sprint_4;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView mTvDate, mTvPositive, mTvNegative, mTvHospital, mTvVentilator, mTvDeath, mTvDateChecked;


    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        mTvDate = itemView.findViewById(R.id.tvDate);
        mTvPositive = itemView.findViewById(R.id.tvPositive);
        mTvNegative = itemView.findViewById(R.id.tvNegative);
        mTvHospital = itemView.findViewById(R.id.tvHospital);
        mTvVentilator = itemView.findViewById(R.id.tvOnVentilatorCurrently);
        mTvDeath = itemView.findViewById(R.id.tvDeath);
        mTvDateChecked = itemView.findViewById(R.id.tvDateChecked);

    }

    public void setData(ResponseModel responseModel) {
        mTvDate.setText( responseModel.getDate());
        mTvPositive.setText(responseModel.getPositive());
        mTvNegative.setText(responseModel.getNegative());
        mTvHospital.setText(responseModel.getHospitalizedCurrently());
        mTvVentilator.setText(responseModel.getOnVentilatorCurrently());
        mTvDeath.setText(responseModel.getDeath());
        mTvDateChecked.setText(responseModel.getDateChecked());

    }


}
