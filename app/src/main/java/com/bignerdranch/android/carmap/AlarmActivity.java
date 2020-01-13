package com.bignerdranch.android.carmap;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

/**
 * Created by hamiltonc on 6/27/2017.
 */

public class AlarmActivity extends AppCompatActivity {

    AlarmManager alarmManager;
    TimePicker alarmTimePicker;
    TextView update_text;
    Context context;
    PendingIntent pendingIntent;


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timer);
        //Toolbar toolbar = (Toolbar) findViewById(R.layout.toolbar);
        this.context = this;

        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

        alarmTimePicker = (TimePicker) findViewById(R.id.timePicker);

        update_text = (TextView) findViewById(R.id.update_text);

        final Calendar calendar = Calendar.getInstance();



        Button startAlarm = (Button) findViewById(R.id.alarm_on);

        final Intent myIntent = new Intent(this.context, AlarmReciever.class);





        startAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calendar.set(Calendar.HOUR_OF_DAY, alarmTimePicker.getCurrentHour());
                calendar.set(Calendar.MINUTE, alarmTimePicker.getCurrentMinute());

                int hour = alarmTimePicker.getCurrentHour();
                int minutes = alarmTimePicker.getCurrentMinute();

                String hourString = String.valueOf(hour);
                String minuteString = String.valueOf(minutes);

                if (hour > 12) {
                    hourString = String.valueOf(hour - 12);
                }

                if (minutes < 10) {
                    minuteString = "0" + String.valueOf(minutes);
                }

                setAlarmText("Alarm set to: " + hourString + ":" + minuteString);

                pendingIntent = PendingIntent.getBroadcast(AlarmActivity.this, 0
                    ,myIntent, PendingIntent.FLAG_UPDATE_CURRENT);


                alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),
                        pendingIntent);
            }
        });





        Button endAlarm= (Button) findViewById(R.id.alarm_off);

        endAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAlarmText("Alarm off!");

                alarmManager.cancel(pendingIntent);
            }
        });



    }

    private void setAlarmText(String output) {
        update_text.setText(output);
    }
}
