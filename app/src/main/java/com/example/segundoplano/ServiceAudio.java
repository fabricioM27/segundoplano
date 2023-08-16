package com.example.segundoplano;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import androidx.annotation.Nullable;



public class ServiceAudio extends Service {
    private Context thisContext=this;
    private MediaPlayer mediaPlayer;
    @Override
    public void onCreate(){


    }

    @Override
    public int onStartCommand(Intent intent, int flag, int idProcess){

        mediaPlayer =MediaPlayer.create(thisContext, R.raw.rise);
        mediaPlayer.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy(){
        mediaPlayer.stop();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
