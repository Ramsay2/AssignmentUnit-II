package com.example.unit_ii_sprint_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText maEtEmailId, maEtPassword;
    private Button btnLogIn;
    private String emailValidation = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        maEtEmailId = findViewById(R.id.etEmailId);
        maEtPassword = findViewById(R.id.etPassword);
        btnLogIn = findViewById(R.id.button);
        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isEmailValid = isEmailValid();
                boolean isPasswordValid = isPasswordValid();
                if (isEmailValid && isPasswordValid) {
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
    private boolean isEmailValid(){
        if(maEtEmailId.getText().toString().matches(emailValidation)){
            return true;
        }else{
            maEtEmailId.setError("Invalid Email");
            return false;
        }
    }
    private  boolean isPasswordValid(){
        if(maEtPassword.getText().toString().length() >6){
            return true;
        }else{
            maEtPassword.setError(" Password is very short");
            return false;
        }

    }
}