package com.example.recyclerview_iii;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeViewHolder> {
    private ArrayList<Employee> employeeList;
    private ItemClickListener itemClickListener;

    public EmployeeAdapter(ArrayList<Employee> employeesList, ItemClickListener itemClickListener) {
        this.employeeList = employeesList;
        this.itemClickListener = itemClickListener;
    }

    @Override
    public EmployeeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new EmployeeViewHolder(view, itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeViewHolder holder, int position) {

        Employee employee = employeeList.get(position);
        holder.setData(employee);

    }

    @Override
    public int getItemCount() {
        return employeeList.size();
    }

    public void updateData(ArrayList<Employee> newList) {
        this.employeeList = employeeList;
    }
}
