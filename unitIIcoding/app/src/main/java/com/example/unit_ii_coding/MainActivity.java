package com.example.unit_ii_coding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView maSignIn;
private TextView maCreateAnAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        maSignIn = findViewById(R.id.tvSignIN);
        maCreateAnAccount = findViewById(R.id.tvCreateAnAccount);
        maSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SignIn_Screen.class);
                startActivity(intent);
            }
        });
        maCreateAnAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View k) {
                Intent intent = new Intent(MainActivity.this,Sign_Up_Screen.class);
                startActivity(intent);
            }
        });
    }
}