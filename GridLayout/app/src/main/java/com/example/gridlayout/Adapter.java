package com.example.gridlayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<Grids>gridList;
    private ItemClickListener itemClickListener;

    public Adapter(ArrayList<Grids> gridList, ItemClickListener itemClickListener) {
        this.gridList = gridList;
        this.itemClickListener = itemClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);

        return new ViewHolder(view,itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Grids grids = gridList.get(position);
        holder.setData(grids);

    }

    @Override
    public int getItemCount() {
        return gridList.size();
    }
}
