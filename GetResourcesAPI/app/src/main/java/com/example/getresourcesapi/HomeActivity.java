package com.example.getresourcesapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeActivity extends AppCompatActivity {
    private LinearLayout hALinear;
    private TextView hAName, hAYear, hACompany;
    String name ;
    int year;
    String color ;
    String company ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        initView();
    }

    private void initView() {
        hALinear = findViewById(R.id.lLBg);
        hAName = findViewById(R.id.tvName);
        hACompany = findViewById(R.id.tvCompany);
        hAYear = findViewById(R.id.tvYear);
        int intent = getIntent().getIntExtra("key",1);
        ApiService apiService = Network.getInstance().create(ApiService.class);

        apiService.getUser(intent).enqueue(new Callback<ResponseDTO>() {
            @Override
            public void onResponse(Call<ResponseDTO> call, Response<ResponseDTO> response) {
                Log.d("sharma",String.valueOf( intent));


                    ResponseDTO model = response.body();
                    name = model.getData().getName();
                    year = model.getData().getYear();
                    color = model.getData().getColor();
                    company = model.getData().getPantoneValue();

                hALinear.setBackgroundColor(Integer.parseInt(color.
                        split("#")[1],16));

                hAName.setText(name);
                hAYear.setText(String.valueOf(year));

                hACompany.setText(company);


            }

            @Override
            public void onFailure(Call<ResponseDTO> call, Throwable t) {

            }
        });
    }


}