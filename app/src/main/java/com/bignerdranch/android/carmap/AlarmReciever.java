package com.bignerdranch.android.carmap;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by hamiltonc on 6/27/2017.
 */

public class AlarmReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("We are in the Reciever", "Yay!");

        Intent serviceIntent = new Intent(context, RingtoneService.class);

        context.startService(serviceIntent);
    }
}
