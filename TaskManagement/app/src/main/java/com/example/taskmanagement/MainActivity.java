package com.example.taskmanagement;

import androidx.appcompat.app.AppCompatActivity;
import com.example.taskmanagement.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button maCreate_Account;
    private TextView maLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        maCreate_Account = findViewById(R.id.tvCreateMainActivity);
        maLogin = findViewById(R.id.tvLoginHome);
        maCreate_Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        maLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, homeScreen.class);
                startActivity(intent);
            }
        });

    }
    public void setMaCreate_Account(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }
}