package com.example.dominiquer.dominiquereliford_firstapp;

import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chill_click(View view){
        ImageView img = (ImageView) findViewById(R.id.imageView);
        img.setImageResource(R.drawable.ayylmao);
    }

    public void happy_click(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.johncena);
        mp.start();
    }

    public void sad_click(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.johncena);
        mp.start();
    }

}
