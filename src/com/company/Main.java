package com.company;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public  static void main(String[] args)
    {
        Artist eliseRyd = new Artist("Elise Ryd");
        Group amaranthe  = new Group("Amaranthe");
        Genre rock = new Genre("Rock");
        List<Genre> parents = new ArrayList<>();
        parents.add(rock);
        Genre modernMetal = new Genre(parents, "Modern Metal");
        Album nexusAlbum = new Album("The Nexus", amaranthe, modernMetal);
        Song nexusSong = new Song("The Nexus", nexusAlbum);
        Cathalog.putAlbum(nexusAlbum);
        Cathalog.putSong(nexusSong);
        Cathalog.putArtist(eliseRyd);
        Cathalog.putGroup(amaranthe);
        Cathalog.putGenre(rock);
        Cathalog.putGenre(modernMetal);
        System.out.println(Cathalog.getSongs(Cathalog.getGenre("Rock")));
    }
}