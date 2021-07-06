package com.example.event_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private Button maSignInButton;
private EditText maEmail, maFirstName,maLastName,maPhoneNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        maSignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isEmailValid() && isPhoneValid()){
                    PreferencesHelper.writeFirstNameToPreference(MainActivity.this,"phone_number",maPhoneNumber.getText().toString());
                    PreferencesHelper.writeFirstNameToPreference(MainActivity.this,"first_name",maFirstName.getText().toString());
                    PreferencesHelper.writeFirstNameToPreference(MainActivity.this,"last_name",maLastName.getText().toString());
                    PreferencesHelper.writeFirstNameToPreference(MainActivity.this,"email_address",maEmail.getText().toString());
                    Intent intent = new Intent(MainActivity.this,Second_Screen.class);
                    startActivity(intent);

                }
            }
        });
    }

    private void initView(){
        maFirstName = findViewById(R.id.etFirstName);
        maLastName = findViewById(R.id.etLast_name);
        maPhoneNumber = findViewById(R.id.etPhone_number);
        maEmail = findViewById(R.id.etEmailAddress);
        maSignInButton = findViewById(R.id.button_to_next_screen);

    }
    private boolean isEmailValid() {
        String emailValidation = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        if (maEmail.getText().toString().matches(emailValidation)) {
            return true;
        } else {
            maEmail.setError("Invalid email");
            return false;
        }
    }
    private boolean isPhoneValid() {
        if (maPhoneNumber.getText().toString().trim().length() == 10) {
            return true;
        } else {
            maPhoneNumber.setError("Phone number is not valid");
            return false;
        }
    }
}