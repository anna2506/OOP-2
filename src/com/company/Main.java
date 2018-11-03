package com.company;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public  static void main(String[] args)
    {
        Artist tylerJoseph = new Artist("Tyler Joseph");
        Group twentyOnePilots  = new Group("Twenty one Pilots");
        Genre hipHop = new Genre("Hip-Hop");
        List<Genre> parents = new ArrayList<>();
        parents.add(hipHop);
        Genre alternativeHipHop = new Genre(parents, "Alternative hip-hop");
        Album Trench = new Album("Trench", twentyOnePilots, alternativeHipHop);
        Song clorine = new Song("Clorine", Trench);
        Cathalog.putAlbum(Trench);
        Cathalog.putSong(clorine);
        Cathalog.putArtist(tylerJoseph);
        Cathalog.putGroup(twentyOnePilots);
        Cathalog.putGenre(hipHop);
        Cathalog.putGenre(alternativeHipHop);
        Group eminem =new Group("Eminem");
        Album kamikadze = new Album("Kamikadze", eminem, hipHop);
        Song venom = new Song("Venom", kamikadze);
        Cathalog.putSong(venom);
        Cathalog.putAlbum(kamikadze);
        Cathalog.putGroup(eminem);
        System.out.println(Cathalog.getSongs(Cathalog.getGenre("Hip-Hop")));
        System.out.println(Cathalog.getSongs(Cathalog.getGroup("Eminem")));
    }
}