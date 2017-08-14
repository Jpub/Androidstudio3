package com.ebookfrenzy.mybroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String message = "Broadcast intent detected "
                + intent.getAction();
        Toast.makeText(context, message,
                Toast.LENGTH_LONG).show();

    }
}
