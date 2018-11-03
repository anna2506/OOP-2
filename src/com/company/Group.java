package com.company;
import java.util.ArrayList;
import java.util.LinkedList;

public class Group {
    private String name;
    private ArrayList <Artist> artists;
    private LinkedList<Album> albums;
    public Group(String name){
        this.name = name;
        artists = new ArrayList<Artist>();
        albums = new LinkedList<Album>();
    }
    void addArtist(Artist artist)
    {
        artists.add(artist);
    }
    public String getName() {
        return name;
    }
    public ArrayList<Artist> getArtists()
    {
        return artists;
    }
    public LinkedList<Album> getAlbums()
    {
        return albums;
    }
    public void setArtists(ArrayList<Artist> artists)
    {
        this.artists = artists;
    }
    public void setAlbums(LinkedList<Album> albums)
    {
        this.albums = albums;
    }
    @Override
    public String toString()
    {
        return "Name of group: " + name;
    }
    @Override
    public boolean equals(Object object)
    {
        if(object == null || this.getClass()!= object.getClass())
        {
            return false;
        }
        return this.name.equals(((Group)object).name);
    }
}
