package com.example.android.music;

public class Song_Creator {

    private String song_name;
    private String song_art;
    int imageid;

    public Song_Creator(String name, String art, int image) {

        song_name = name;
        song_art = art;
        imageid = image;
    }

    public String get_Song_name() {
        return song_name;
    }

    public String get_Song_art() {
        return song_art;
    }

    public int get_Song_image() {
        return imageid;
    }

}
