package com.example.android.music;

/**
 * Created by Rohaan on 22-Dec-17.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongDisplay extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_display);

        final ArrayList<Song_Creator> androidFlavors = new ArrayList<Song_Creator>();
        androidFlavors.add(new Song_Creator("Somebody To You", "The Vamps", R.drawable.vamps2));
        androidFlavors.add(new Song_Creator("Attention", "Charley Puth", R.drawable.song1));
        androidFlavors.add(new Song_Creator("Despacito", "Luis Fonsi", R.drawable.song2));

        final ArrayList<String> SongName = new ArrayList<String>();
        SongName.add("Somebody To You");
        SongName.add("Attention");
        SongName.add("Despacito");

        final ArrayList<String> ArtistName = new ArrayList<String>();
        ArtistName.add("The Vamps");
        ArtistName.add("Charley Puth");
        ArtistName.add("Luis Fonsi");

        final ArrayList<Integer> ImageId = new ArrayList<Integer>();
        ImageId.add(R.drawable.vamps2);
        ImageId.add(R.drawable.song1);
        ImageId.add(R.drawable.song2);

        SongCreatorAdapter flavorAdapter = new SongCreatorAdapter(this, androidFlavors);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(flavorAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String songName = SongName.get(position).toString();
                String artistName = ArtistName.get(position).toString();
                int imageName = ImageId.get(position);

                SongPlay s = new SongPlay();
                s.set_song(songName, artistName, imageName);

                Intent it = new Intent(view.getContext(), SongPlay.class);
                view.getContext().startActivity(it);
            }
        });

    }

}
