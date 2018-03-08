package com.example.wagenhuberg.android_180308_broadcastreceiversample_viacontext;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by wagenhuberg on 08.03.2018.
 */

public class MeinBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_AIRPLANE_MODE_CHANGED.equals(intent.getAction())) {
            Toast.makeText(context, "Airplane Mode geändert", Toast.LENGTH_LONG).show();
        }
    }
}
