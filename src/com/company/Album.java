package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Album {
    private ArrayList<Song> album;
    private String name;
    private Group group;
    private Genre genre;
    private Date release;
    public Album(String name, Group group, Genre genre){
        album = new ArrayList<Song>();
        this.genre = genre;
        this.group = group;
        this.name = name;
        this.release = release;
    }
    public void addSong(Song song)
    {
        album.add(song);
    }
    public String getName() {
        return name;
    }
    public Genre getGenre() {
        return genre;
    }
    public Date getRelease() {
        return release;
    }
    public ArrayList<Song> getAlbum() {
        return album;
    }
    public Group getGroup() {
        return group;
    }
    public Song getSong(int index)
    {
        return album.get(index);
    }
    @Override
    public String toString() {
        return group.toString()+ " released " + name;
    }
}
