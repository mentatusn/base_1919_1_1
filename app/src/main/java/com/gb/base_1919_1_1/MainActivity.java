package com.gb.base_1919_1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) { // совесть разработчика
            startForegroundService(new Intent(this,MyService.class));
        }else {
            // КАКИЕ-ТО КОСТЫЛИ startService
        }
    }
}