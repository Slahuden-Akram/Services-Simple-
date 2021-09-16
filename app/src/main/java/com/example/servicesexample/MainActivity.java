package com.example.servicesexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnStart = (Button) findViewById(R.id.btnStart);
        Button btnStop = (Button) findViewById(R.id.btnStop);

        Log.d(TAG, "onCreate: OnCreate Event Executed");
    }

    public void startService(View view){
        Intent intent= new Intent(getApplicationContext(), MyService.class);
        startService(intent);
//        startService(new Intent(getApplicationContext(), MyService.class));
    }
    public void stopService(View view) {
        Intent intent= new Intent(getApplicationContext(), MyService.class);
        stopService(intent);
//        stopService(new Intent(getBaseContext(), MyService.class));
    }
}