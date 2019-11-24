package com.example.alarmscheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class SampleBoostReciever extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
            // Set the alarm here.
        }
    }
}
