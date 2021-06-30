package com.example.intentandintentfilters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Home_Activity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mTextView = findViewById(R.id.tvUsername);
        Intent intent = getIntent();
        String userName = intent.getStringExtra("username");
        mTextView.setText(userName);
    }

}