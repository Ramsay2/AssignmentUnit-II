package com.example.event_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Second_Screen extends AppCompatActivity {
    private EditText sSPhoneNumber, sSEmailAddress, sSFirstName, sSLastName,sSDate,sSSeats;
    private Button sSNextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        initView();
        sSFirstName.setText(PreferencesHelper.getStringFromPreference(Second_Screen.this, "first_name"));
        sSLastName.setText(PreferencesHelper.getStringFromPreference(Second_Screen.this, "last_name"));
        sSEmailAddress.setText(PreferencesHelper.getStringFromPreference(Second_Screen.this, "email_address"));

        sSNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PreferencesHelper.writeFirstNameToPreference(Second_Screen.this,"Date",sSDate.getText().toString());
                PreferencesHelper.writeFirstNameToPreference(Second_Screen.this,"Seats",sSSeats.getText().toString());
                Intent intent = new Intent(Second_Screen.this, Home_Screen.class);
                startActivity(intent);
            }
        });

    }

    private void initView() {
        sSFirstName = findViewById(R.id.etSsFirstName);
        sSLastName = findViewById(R.id.etSsLast_name);
        sSEmailAddress = findViewById(R.id.etSsEmailAddress);
        sSNextButton = findViewById(R.id.sSNext);
        sSSeats = findViewById(R.id.etSsNoOfSeat);
        sSDate = findViewById(R.id.etSsDate);
    }
}