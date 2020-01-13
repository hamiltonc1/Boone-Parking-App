package com.bignerdranch.android.carmap;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import java.security.Provider;
import java.util.List;
import java.util.Map;

/**
 * Created by hamiltonc on 6/27/2017.
 */

public class RingtoneService extends Service {


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent) {



        return START_NOT_STICKY;
    }
}
