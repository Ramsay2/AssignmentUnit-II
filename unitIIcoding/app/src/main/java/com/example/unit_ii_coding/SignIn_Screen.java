package com.example.unit_ii_coding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

public class SignIn_Screen extends AppCompatActivity {
private TextView SInScreen;
private TextView SInSignUpText;
private EditText sInScreenName;
private EditText sInPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_screen);
        initView();
        SInScreen = findViewById(R.id.SignInClickSignInScreen);
        SInSignUpText = findViewById(R.id.tvSignUpSignInScreen);
        SInScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isNameValid = isNameValid();
                boolean isPasswordValid = isPasswordValid();
                if (isNameValid && isPasswordValid) {
                    Intent intent = new Intent(SignIn_Screen.this, HomeScreen.class);
                    intent.putExtra("name", R.id.editTextTextPersonNameSignInScreen);

                    startActivity(intent);

                }
            }
        });
        SInSignUpText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View k) {
                Intent intent = new Intent(SignIn_Screen.this, Sign_Up_Screen.class);
                startActivity(intent);
            }
        });
    }
    private void initView(){
        sInScreenName = findViewById(R.id.editTextTextPersonNameSignInScreen);
        sInPassword = findViewById(R.id.etPasswordSignInScreen);
    }
    private boolean isNameValid(){
        if(sInScreenName.getText().toString().length() > 4){
            return true;
        }else{
            sInScreenName.setError("Invalid Name");
            return false;
        }
    }
    private boolean isPasswordValid(){
        if(sInPassword.getText().toString().length() > 6){
            return true;
        }else{
            sInPassword.setError("Invalid Password");
            return false;
        }
    }

}