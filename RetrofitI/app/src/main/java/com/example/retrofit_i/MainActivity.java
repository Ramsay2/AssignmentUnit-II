package com.example.retrofit_i;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


private EditText mEtUserId;
private Button mBtnCallApi;
private TextView mTvFirstName, mTvLastName, mTvEmail;
private ImageView mIvAvatar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mBtnCallApi = findViewById(R.id.btnCallApi);
        mEtUserId = findViewById(R.id.etUserId);
        mTvEmail = findViewById(R.id.tvEmail);
        mTvFirstName = findViewById(R.id.tvfirstName);
        mTvLastName = findViewById(R.id.tvLastName);
        mIvAvatar = findViewById(R.id.ivAvatar);


        mBtnCallApi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ApiService apiService = Network.getInstance().create(ApiService.class);
                int userId = Integer.parseInt(mEtUserId.getText().toString());
                apiService.getUser(userId).enqueue(new Callback<ResponseDTO>() {
                    @Override
                    public void onResponse(Call<ResponseDTO> call, Response<ResponseDTO> response) {

                        ResponseDTO model = response.body();
                        String firstName = model.getData().getFirstName();
                        String lastName = model.getData().getLastName();
                        String email = model.getData().getEmail();


                        mTvFirstName.setText(firstName);
                        mTvLastName.setText(lastName);
                        mTvEmail.setText(email);

                        Glide.with(mIvAvatar).load(model.getData().getAvatar()).into(mIvAvatar);


                    }

                    @Override
                    public void onFailure(Call<ResponseDTO> call, Throwable t) {

                    }
                });
            }
        });
    }
}