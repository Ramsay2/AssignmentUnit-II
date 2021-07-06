package com.example.event_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Home_Screen extends AppCompatActivity {
    private TextView hSPhoneNumber, hSEmailAddress, hSFirstName, hSLastName, hSDateOfBooking, hSSeats;
    private Button hSConfirmButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        initView();
        hSPhoneNumber.setText(PreferencesHelper.getStringFromPreference(Home_Screen.this, "phone_number"));
        hSFirstName.setText(PreferencesHelper.getStringFromPreference(Home_Screen.this, "first_name"));
        hSLastName.setText(PreferencesHelper.getStringFromPreference(Home_Screen.this, "last_name"));
        hSEmailAddress.setText(PreferencesHelper.getStringFromPreference(Home_Screen.this, "email_address"));
        hSDateOfBooking.setText(PreferencesHelper.getStringFromPreference(Home_Screen.this, "Date"));
        hSSeats.setText(PreferencesHelper.getStringFromPreference(Home_Screen.this, "Seats"));
        hSConfirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Booking is Confirmed");
            }
        });
    }

    private void initView() {
        hSPhoneNumber = findViewById(R.id.hSPhone);
        hSEmailAddress = findViewById(R.id.hSEmail);
        hSFirstName = findViewById(R.id.hSFirst);
        hSLastName = findViewById(R.id.hSLast);
        hSDateOfBooking = findViewById(R.id.hSDate);
        hSSeats = findViewById(R.id.hSSeats);
        hSConfirmButton = findViewById(R.id.hSConfirm);
    }

    public void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}