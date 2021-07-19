package com.example.activitylifecycle;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle","onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle","onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle","onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle","onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle","onStop");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle","onRestart");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","onDestroy");
    }
}