package com.example.eventlistenersandsaveuistates;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button btnClick;
    private EditText tvEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnFirstButton = findViewById(R.id.BtnChange);
        tvEdit = findViewById(R.id.EditText);
        tvEdit.addTextChangedListener(textWatcher);

        btnFirstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "ButtonClicked", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private TextWatcher textWatcher = new TextWatcher() {

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            if (s.toString().length() > 6) {
                Toast.makeText(MainActivity.this, s.toString(), Toast.LENGTH_SHORT).show();
                Log.d("MasaiSchool", s.toString());
                Log.d("toast","More then 6");
            }

        }
    };
}

