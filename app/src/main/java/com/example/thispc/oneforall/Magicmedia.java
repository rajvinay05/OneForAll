package com.example.thispc.oneforall;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;

public class Magicmedia extends AppCompatActivity {

    SeekBar seekBar;
    MediaPlayer mp;
    Handler h;
    Runnable runnable;

    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magicmedia);

        b1 = (Button) findViewById(R.id.button22);




        h = new Handler();
        mp = MediaPlayer.create(this, R.raw.baahu);
        seekBar = (SeekBar) findViewById(R.id.seekBar);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(mp.isPlaying()){
                   mp.pause();
               }
                else{
                   mp.start();
                   onResume();
               }

            }
        });



        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);




        mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                seekBar.setMax(mp.getDuration());
                playCycle();
                mp.start();
            }
        });


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean input) {
                if(input){
                    mp.seekTo(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });




    }
       public void playCycle()
        {
       seekBar.setProgress(mp.getCurrentPosition());

        if (mp.isPlaying()){
            runnable=new Runnable() {
                @Override
                public void run() {
                    playCycle();
                }
            };
            h.postDelayed(runnable,1000);

        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        mp.start();
        playCycle();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mp.pause();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i=new Intent(Magicmedia.this,Second.class);
        startActivity(i);
        finish();
    }
}
