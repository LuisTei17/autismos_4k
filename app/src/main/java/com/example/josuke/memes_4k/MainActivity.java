package com.example.josuke.memes_4k;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btWhatsapp, btGlobins;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btWhatsapp = (Button) findViewById(R.id.meme_whatsapp);
        btGlobins = (Button) findViewById(R.id.meme_goblin);

        final MediaPlayer meme_whatsapp = MediaPlayer.create(MainActivity.this, R.raw.whatsapp);
        meme_whatsapp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

            @Override
            public void onCompletion(MediaPlayer meme_whatsapp) {

                meme_whatsapp.release();
            }

        });
        btWhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                meme_whatsapp.start();
            }
        });
        final MediaPlayer meme_goblins = MediaPlayer.create(MainActivity.this, R.raw.goblin);
        meme_goblins.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

            @Override
            public void onCompletion(MediaPlayer meme_globins) {

                meme_goblins.release();
            }

        });

        btGlobins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                meme_goblins.start();
            }
        });



    }
}
