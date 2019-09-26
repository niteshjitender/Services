package com.w.service1;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyService extends Service {
    MediaPlayer mediaPlayer;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {

        return null;
    }
    public void  onCreate() {
        Toast.makeText(this,"service created..",Toast.LENGTH_SHORT).show();
        mediaPlayer = MediaPlayer.create(this,R.raw.song) ;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "service created..", Toast.LENGTH_SHORT).show();
        mediaPlayer.start();

        return super.onStartCommand(intent,flags,startId);
    }
    @Override
    public void onDestroy() {
        Toast.makeText(this,"service destroyed..",Toast.LENGTH_SHORT).show();
        mediaPlayer.release();
    }
}
