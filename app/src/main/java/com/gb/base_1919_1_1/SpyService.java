package com.gb.base_1919_1_1;


import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class SpyService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("mylogs","MyService onCreate()");
        Log.d("mylogs","включаем камеру");
        Log.d("mylogs","подсматриваем за пользователем");
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
