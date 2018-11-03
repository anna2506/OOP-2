package com.company;
import java.util.*;

public final class Cathalog
{
    private static Map<String, Song> songMap = new HashMap<>();
    private static Map<String, Genre> genreMap = new HashMap<>();
    private static Map<String, Album> albumMap = new HashMap<>();
    private static Map<String, Group> groupMap = new HashMap<>();
    private static Map<String, Artist> artistMap = new HashMap<>();
    private static Map<String, Compilation> compilationMap = new HashMap<>();
    private Cathalog()
    {
    }
    public static Genre getGenre(String name)
    {
        return genreMap.get(name);
    }

    public static Song getSong(String name)
    {
        return songMap.get(name);
    }

    public static Album getAlbum(String name)
    {
        return albumMap.get(name);
    }

    public static Group getGroup(String name)
    {
        return groupMap.get(name);
    }

    public static Artist getArtist(String name)
    {
        return artistMap.get(name);
    }

    public static Compilation getCompilation(String name)
    {
        return compilationMap.get(name);
    }

    public static void putGenre(Genre genre)
    {
        genreMap.put(genre.getName(), genre);
    }

    public static void putSong(Song song)
    {
        songMap.put(song.getName(), song);
    }

    public static void putAlbum(Album album)
    {
        albumMap.put(album.getName(), album);
    }

    public static void putGroup(Group group)
    {
        groupMap.put(group.getName(), group);
    }

    public static void putArtist(Artist artist)
    {
        artistMap.put(artist.getPseudonym(), artist);
    }

    public static void putCompilation(Compilation compilation)
    {
        compilationMap.put(compilation.getName(), compilation);
    }
    public static List<Song> getSongs(Genre genre)
    {
        List<Song> songs = new ArrayList<>();
        for(Map.Entry<String, Song> entry : songMap.entrySet())
        {
            if(genre.equals(entry.getValue().getAlbum().getGenre()))
            {
                songs.add(entry.getValue());
            }
        }
        for(Genre child : genre.getChildren())
        {
            songs.addAll(getSongs(child));
        }
        return songs;
    }
    public static  List<Song>  getSongs(Group group)
    {
        List<Song> songs = new ArrayList<>();
        for(Map.Entry<String, Song> entry : songMap.entrySet())
        {
            if(group.equals(entry.getValue().getAlbum().getGroup()))
            {
                songs.add(entry.getValue());
            }
        }
        return songs;
    }
}
