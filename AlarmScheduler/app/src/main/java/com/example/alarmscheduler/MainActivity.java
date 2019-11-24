package com.example.alarmscheduler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

import static android.content.pm.PackageManager.*;

public class MainActivity<receiver, COMPONENT_ENABLED_STATE_ENABLED, DONT_KILL_APP> extends AppCompatActivity {

    public MainActivity() {
        receiver = new ComponentName(context, SampleBoostReciever.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    ComponentName receiver;
    private Context context;
    PackageManager pm = context.getPackageManager();

pm.setComponentEnabledSetting(receiver, COMPONENT_ENABLED_STATE_ENABLED, DONT_KILL_APP)
}
