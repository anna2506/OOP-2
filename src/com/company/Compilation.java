package com.company;

import java.util.LinkedList;
import java.util.List;

public class Compilation {
  private String name;
  private LinkedList<Song> songs;
  public Compilation(String name)
  {
    songs = new LinkedList<Song>();
    this.name = name;
  }
  public void addSongs(Song song)
  {
    songs.add(song);
  }

  public String getName()
  {
    return name;
  }

  public LinkedList<Song> getSongs()
  {
    return songs;
  }

  @Override
  public String toString() {
    return name + " contains " + songs;
  }
}
