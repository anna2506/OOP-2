package com.company;

public class Song {
    private final String name;
    private Album album;
    public Song(String name, Album album)
    {
        this.name = name;
        this.album = album;
    }

    public String getName() {
        return name;
    }

    public Album getAlbum() {
        return album;
    }

    @Override
    public String toString() {
        return "Name of song: " + name;
    }
}
