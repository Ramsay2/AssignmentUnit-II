package com.example.gridlayout;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;


public class ViewHolder extends RecyclerView.ViewHolder {

    private TextView mTvTextView;
    private ItemClickListener itemClickListener;


    public ViewHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener= itemClickListener;
        mTvTextView = itemView.findViewById(R.id.textView);

    }

    public void setData(Grids grids) {
        mTvTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClick(grids,mTvTextView);
            }
        });
    }
}
