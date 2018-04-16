package com.example.android.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout l = (LinearLayout) findViewById(R.id.now_playing);
        l.setOnClickListener(new LinearLayout.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(v.getContext(), SongDisplay.class);
                startActivity(i);
            }

        });

        LinearLayout l1 = (LinearLayout) findViewById(R.id.Album);
        l1.setOnClickListener(new LinearLayout.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(v.getContext(), Albums.class);
                startActivity(i);
            }

        });


        LinearLayout l2 = (LinearLayout) findViewById(R.id.Playlist);
        l2.setOnClickListener(new LinearLayout.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(v.getContext(), Playlist.class);
                startActivity(i);
            }

        });

        RelativeLayout r = (RelativeLayout) findViewById(R.id.PlayingNow);
        r.setOnClickListener(new RelativeLayout.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(v.getContext(), SongPlay.class);
                startActivity(i);
            }

        });
        Payment sp = new Payment();
        RelativeLayout rp1 = (RelativeLayout) findViewById(R.id.pay1);
        LinearLayout lp1 = (LinearLayout) findViewById(R.id.pay2);
        LinearLayout lp2 = (LinearLayout) findViewById(R.id.pay3);
        LinearLayout lp3 = (LinearLayout) findViewById(R.id.pay4);
        LinearLayout lp4 = (LinearLayout) findViewById(R.id.pay5);
        LinearLayout lp5 = (LinearLayout) findViewById(R.id.pay6);
        LinearLayout lp6 = (LinearLayout) findViewById(R.id.pay7);
        LinearLayout lp7 = (LinearLayout) findViewById(R.id.pay8);
        LinearLayout lp8 = (LinearLayout) findViewById(R.id.pay9);
        LinearLayout lp9 = (LinearLayout) findViewById(R.id.pay10);
        LinearLayout lp10 = (LinearLayout) findViewById(R.id.pay11);
        LinearLayout lp11 = (LinearLayout) findViewById(R.id.pay12);
        LinearLayout lp12 = (LinearLayout) findViewById(R.id.pay13);
        LinearLayout lp13 = (LinearLayout) findViewById(R.id.pay14);

        rp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Play", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(v.getContext(), Payment.class);
                startActivity(i);
            }
        });
        lp1.setOnClickListener(new View.OnClickListener() {             @Override             public void onClick(View v) {                 Toast.makeText(v.getContext(), "Play", Toast.LENGTH_SHORT).show();                  Intent i = new Intent(v.getContext(), Payment.class);                 startActivity(i);             }         });
        lp2.setOnClickListener(new View.OnClickListener() {             @Override             public void onClick(View v) {                 Toast.makeText(v.getContext(), "Play", Toast.LENGTH_SHORT).show();                  Intent i = new Intent(v.getContext(), Payment.class);                 startActivity(i);             }         });
        lp3.setOnClickListener(new View.OnClickListener() {             @Override             public void onClick(View v) {                 Toast.makeText(v.getContext(), "Play", Toast.LENGTH_SHORT).show();                  Intent i = new Intent(v.getContext(), Payment.class);                 startActivity(i);             }         });
        lp4.setOnClickListener(new View.OnClickListener() {             @Override             public void onClick(View v) {                 Toast.makeText(v.getContext(), "Play", Toast.LENGTH_SHORT).show();                  Intent i = new Intent(v.getContext(), Payment.class);                 startActivity(i);             }         });
        lp5.setOnClickListener(new View.OnClickListener() {             @Override             public void onClick(View v) {                 Toast.makeText(v.getContext(), "Play", Toast.LENGTH_SHORT).show();                  Intent i = new Intent(v.getContext(), Payment.class);                 startActivity(i);             }         });
        lp6.setOnClickListener(new View.OnClickListener() {             @Override             public void onClick(View v) {                 Toast.makeText(v.getContext(), "Play", Toast.LENGTH_SHORT).show();                  Intent i = new Intent(v.getContext(), Payment.class);                 startActivity(i);             }         });
        lp7.setOnClickListener(new View.OnClickListener() {             @Override             public void onClick(View v) {                 Toast.makeText(v.getContext(), "Play", Toast.LENGTH_SHORT).show();                  Intent i = new Intent(v.getContext(), Payment.class);                 startActivity(i);             }         });
        lp8.setOnClickListener(new View.OnClickListener() {             @Override             public void onClick(View v) {                 Toast.makeText(v.getContext(), "Play", Toast.LENGTH_SHORT).show();                  Intent i = new Intent(v.getContext(), Payment.class);                 startActivity(i);             }         });
        lp9.setOnClickListener(new View.OnClickListener() {             @Override             public void onClick(View v) {                 Toast.makeText(v.getContext(), "Play", Toast.LENGTH_SHORT).show();                  Intent i = new Intent(v.getContext(), Payment.class);                 startActivity(i);             }         });
        lp10.setOnClickListener(new View.OnClickListener() {             @Override             public void onClick(View v) {                 Toast.makeText(v.getContext(), "Play", Toast.LENGTH_SHORT).show();                  Intent i = new Intent(v.getContext(), Payment.class);                 startActivity(i);             }         });
        lp11.setOnClickListener(new View.OnClickListener() {             @Override             public void onClick(View v) {                 Toast.makeText(v.getContext(), "Play", Toast.LENGTH_SHORT).show();                  Intent i = new Intent(v.getContext(), Payment.class);                 startActivity(i);             }         });
        lp12.setOnClickListener(new View.OnClickListener() {             @Override             public void onClick(View v) {                 Toast.makeText(v.getContext(), "Play", Toast.LENGTH_SHORT).show();                  Intent i = new Intent(v.getContext(), Payment.class);                 startActivity(i);             }         });
        lp13.setOnClickListener(new View.OnClickListener() {             @Override             public void onClick(View v) {                 Toast.makeText(v.getContext(), "Play", Toast.LENGTH_SHORT).show();                  Intent i = new Intent(v.getContext(), Payment.class);                 startActivity(i);             }         });

    }
}
