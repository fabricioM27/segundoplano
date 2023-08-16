package com.example.segundoplano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Context thisContext=this;
    private Button btniniciar;
    private Button btndetener;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btniniciar= (Button) findViewById(R.id.btniniciar);
        btndetener= (Button) findViewById(R.id.btndetener);


        btniniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            onClickListenerBtnIniciar(v);
            }
        });

        btndetener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickListenerBtnDetener(v);
            }
        });

    }

    private void onClickListenerBtnIniciar(View v){
        startService(new Intent(thisContext, ServiceAudio.class));
    }

    private void onClickListenerBtnDetener(View v){
        stopService(new Intent(thisContext, ServiceAudio.class));
    }


}