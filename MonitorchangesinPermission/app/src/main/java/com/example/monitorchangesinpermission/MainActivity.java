package com.example.monitorchangesinpermission;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final int REQUEST_CODE = 0;
    private Button mBtnRequestPermission;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnRequestPermission = findViewById(R.id.btnRequestPermission);
        mBtnRequestPermission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] permission = {Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.ACCESS_FINE_LOCATION};
                ActivityCompat.requestPermissions(MainActivity.this, permission, REQUEST_CODE);
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED) {
            showToast(" storage and Location permission granted");
        } else if (grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_DENIED) {
            showToast(" storage granted and Location permission denied");
        } else if (grantResults[0] == PackageManager.PERMISSION_DENIED && grantResults[1] == PackageManager.PERMISSION_GRANTED) {
            showToast("storage denied and Location permission granted");

        } else if (grantResults[0] == PackageManager.PERMISSION_DENIED && grantResults[1] == PackageManager.PERMISSION_DENIED) {
            showToast("Both the permissions denied");
        }
    }

    public void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}