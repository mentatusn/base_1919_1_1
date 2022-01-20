package com.gb.base_1919_1_1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

public class SpyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) { // совесть разработчика
            context.startForegroundService(new Intent(context,SpyService.class));
        }else {
            // КАКИЕ-ТО КОСТЫЛИ startService
        }
    }
}
