package com.example.unit_ii_coding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Sign_Up_Screen extends AppCompatActivity {
    private TextView SUSSignUpClick, sUSSignInClick;
    private EditText SUSEmail;
    private EditText SUSName;
    private EditText SUSPassword;
    private String emailValidation = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_screen);
        sUSSignInClick = findViewById(R.id.tvSignIn);
        initView();
        SUSSignUpClick = findViewById(R.id.SignUpClick);
        SUSSignUpClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isEmailValid = isEmailValid();
                boolean isPasswordValid = isPasswordValid();
                boolean isNameValid = isNameValid();
                if (isEmailValid && isPasswordValid && isNameValid) {
                    Intent intent = new Intent(Sign_Up_Screen.this, HomeScreen.class);
                    startActivity(intent);
                }
            }
        });
     sUSSignInClick.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent = new Intent(Sign_Up_Screen.this,SignIn_Screen.class);
             startActivity(intent);
         }
     });
    }
    private void initView(){
        SUSEmail = findViewById(R.id.etEmailAddress);
        SUSName = findViewById(R.id.editTextTextPersonName);
        SUSPassword = findViewById(R.id.tvEnterPassword);
    }
    private boolean isEmailValid(){
        if(SUSEmail.getText().toString().length() >=1 &&SUSEmail.getText().toString().matches(emailValidation)){
            return true;
        }else{
            SUSEmail.setError("Invalid Email");
            return false;
        }
        }
    private boolean isNameValid(){
        if(SUSName.getText().toString().length() > 4){
            return true;
        }else{
            SUSName.setError("Invalid Name");
            return false;
        }
    }
    private boolean isPasswordValid(){
        if(SUSPassword.getText().toString().length() > 6){
            return true;
        }else{
            SUSPassword.setError("Invalid Password");
            return false;
        }
    }
    }
