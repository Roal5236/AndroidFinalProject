package com.example.android.music;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongCreatorAdapter extends ArrayAdapter<Song_Creator> {

    public static final String LOG_TAG = SongCreatorAdapter.class.getSimpleName();

    public SongCreatorAdapter(Activity context, ArrayList<Song_Creator> s) {

        super(context, 0, s);
    }

    public View getView(int pos, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_item, parent, false);
        }

        Song_Creator currentSong = getItem(pos);

        TextView tv = (TextView) listItemView.findViewById(R.id.version_name);
        tv.setText(currentSong.get_Song_name());

        TextView tv2 = (TextView) listItemView.findViewById(R.id.version_number);
        tv2.setText(currentSong.get_Song_art());

        ImageView icon = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        icon.setImageResource(currentSong.get_Song_image());

        return listItemView;
    }
}
