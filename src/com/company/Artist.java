package com.company;

import java.util.LinkedList;

public class Artist{
    private String pseudonym;
    private LinkedList<Album> albums;
    public Artist(String pseudonym)
    {
        albums = new LinkedList<Album>();
        this.pseudonym = pseudonym;
    }
    public String getPseudonym()
    {
        return pseudonym;
    }
    @Override
    public String toString() {
        return "Pseudonym of artist is: "+pseudonym;
    }
}
