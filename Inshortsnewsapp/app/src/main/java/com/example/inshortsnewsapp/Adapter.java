package com.example.inshortsnewsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {
    private List<DataModel> modelList;

    public Adapter(List<DataModel> modelList) {
        this.modelList = modelList;
    }


    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DataModel dataModel = modelList.get(position);
        holder.setData(dataModel);
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }
    public void updateData(List<DataModel> modelList){
        this.modelList= modelList;
        notifyDataSetChanged();
    }
}
