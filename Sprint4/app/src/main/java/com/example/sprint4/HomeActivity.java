package com.example.sprint4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView hARecyclerView;
    private List<ResponseModel> responseModelList = new ArrayList<>();
    private Adapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
        setRecyclerView();
    }

    private void initView() {
        hARecyclerView = findViewById(R.id.recyclerview);

        apiCall();

    }
    private void apiCall(){
        ApiService apiService = Network.getInstance().create(ApiService.class);
        apiService.getUser().enqueue(new Callback<List<ResponseModel>>() {
            @Override
            public void onResponse(Call<List<ResponseModel>> call, Response<List<ResponseModel>> response) {
                responseModelList = response.body();
                adapter.updateData(responseModelList);

            }

            @Override
            public void onFailure(Call<List<ResponseModel>> call, Throwable t) {

            }
        });

    }
    private void setRecyclerView(){
        adapter = new Adapter(responseModelList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        hARecyclerView.setLayoutManager(linearLayoutManager);
        hARecyclerView.setAdapter(adapter);

    }
}