package com.example.inshortsnewsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private EditText metCategory;
    private Button mBtnSearch;
    private RecyclerView mRecycleView;
    private List<DataModel> dataModel = new ArrayList<>();
    private Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setRecyclerView();
    }


    private void initView() {
        metCategory = findViewById(R.id.etCategory);
        mRecycleView = findViewById(R.id.maRecyclerView);
        mBtnSearch = findViewById(R.id.btnCall);
        mBtnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callApi();
            }
        });

    }


    private void callApi() {

        ApiService apiService = Network.getInstance().create(ApiService.class);
        String category = metCategory.getText().toString();
        apiService.getPost(category).enqueue(new Callback<ResponseModel>() {

            @Override
            public void onResponse(Call<ResponseModel>call, Response<ResponseModel> response) {
                Log.d("sharma", "aaya k nai");
                if (response.body() != null) {

                    adapter.updateData(response.body().getData());

                }
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {

            }
        });
    }

    private void setRecyclerView() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        mRecycleView.setLayoutManager(linearLayoutManager);
        adapter = new Adapter(dataModel);
        mRecycleView.setAdapter(adapter);


    }
}