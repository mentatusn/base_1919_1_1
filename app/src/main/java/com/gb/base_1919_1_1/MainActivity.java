package com.gb.base_1919_1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("mylogs","MainActivity onCreate()");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) { // совесть разработчика
            startForegroundService(new Intent(this,SpyService.class));
        }else {
            // КАКИЕ-ТО КОСТЫЛИ startService
        }
    }
}