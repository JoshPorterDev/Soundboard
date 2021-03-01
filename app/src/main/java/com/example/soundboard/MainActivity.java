package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton hank1, hank2, hank3, hank4, bobby, dale, boomhauer, bill, kahn;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // save imageButtons to variables
        hank1 = findViewById(R.id.hank1);
        hank2 = findViewById(R.id.hank2);
        hank3 = findViewById(R.id.hank3);
        hank4 = findViewById(R.id.hank4);
        bobby = findViewById(R.id.bobby);
        dale = findViewById(R.id.dale);
        boomhauer = findViewById(R.id.boomhauer);
        bill = findViewById(R.id.bill);
        kahn = findViewById(R.id.kahn);

        hank1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.chinese);
                mediaPlayer.start();
            }
        });

        hank2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.excuse);
                mediaPlayer.start();
            }
        });

        hank3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.emotional);
                mediaPlayer.start();
            }
        });

        hank4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.wd40);
                mediaPlayer.start();
            }
        });

        bobby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.raccoons);
                mediaPlayer.start();
            }
        });

        dale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.intruder);
                mediaPlayer.start();
            }
        });

        boomhauer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.meaningful);
                mediaPlayer.start();
            }
        });

        bill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.texas);
                mediaPlayer.start();
            }
        });

        kahn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.myson);
                mediaPlayer.start();
            }
        });

        //mediaPlayer = null;
    }
}