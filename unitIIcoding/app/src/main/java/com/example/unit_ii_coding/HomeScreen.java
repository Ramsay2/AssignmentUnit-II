package com.example.unit_ii_coding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {
private TextView hsNameChange;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        hsNameChange = findViewById(R.id.tvNameHomeScreen);
        String changeName = getIntent().getStringExtra("name");
        hsNameChange.setText(changeName);

    }
}