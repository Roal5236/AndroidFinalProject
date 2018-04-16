package com.example.android.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class SongPlay extends AppCompatActivity {

    private static String Song_name = "Somebody To You", Artist = "TheVamps";
    private static int imageno = R.drawable.vamps2, q = 0;


    public void set_song(String name, String artist, int imageid) {

        Song_name = name;
        Artist = artist;
        imageno = imageid;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_play);
        TextView name = (TextView) findViewById(R.id.SongName);
        TextView art = (TextView) findViewById(R.id.artist);
        ImageView cover = (ImageView) findViewById(R.id.cover);
        ImageView back = (ImageView) findViewById(R.id.faded_back);

        name.setText(Song_name);
        art.setText(Artist);
        cover.setImageResource(imageno);
        back.setImageResource(imageno);

        final ImageView playButton = (ImageView) findViewById(R.id.play);
        playButton.setOnClickListener(new ImageView.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (q == 0) {
                    playButton.setImageResource(R.drawable.paly);
                    q = 1;
                } else {
                    playButton.setImageResource(R.drawable.pause);
                    q = 0;
                }

            }
        });

        ImageView ib = (ImageView) findViewById(R.id.buyNow);
        ib.setOnClickListener(new ImageButton.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(v.getContext(), Payment.class);
                startActivity(i);

            }
        });

        ImageView home = (ImageView) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(v.getContext(), MainActivity.class);
                startActivity(i);

            }
        });

    }
}
