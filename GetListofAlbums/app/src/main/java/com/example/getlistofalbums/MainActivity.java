package com.example.getlistofalbums;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private List<ResponseModel> dataList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        callApi();
        setRecyclerView();
    }

    private void initView() {
        mRecyclerView = findViewById(R.id.recyclerView);
    }

    private void callApi() {
        ApiService apiService = Network.getInstance().create(ApiService.class);
        apiService.getPost().enqueue(new Callback<List<ResponseModel>>() {
            @Override
            public void onResponse(Call<List<ResponseModel>> call, Response<List<ResponseModel>> response) {
                if (response.body() != null) {
                    dataList = response.body();
                    setRecyclerView();
                }
            }


            @Override
            public void onFailure(Call<List<ResponseModel>> call, Throwable t) {

            }
        });

    }

    private void setRecyclerView() {

        Adapter adapter = new Adapter(dataList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setAdapter(adapter);

    }


}