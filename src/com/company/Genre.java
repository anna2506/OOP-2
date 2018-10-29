package com.company;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Genre
{
    private LinkedList<Song> collection = new LinkedList<Song>();
    private String name;
    private List <Genre> parents;
    private List <Genre> children;
    public  Genre(String name)
    {
        parents =null;
        this.name=name;
        children = new LinkedList<Genre>();
    }

    public String getName() {
        return name;
    }

    public Genre (List<Genre> parents, String name)
    {
        this.name = name;
        this.parents  = parents;
        this.children = new LinkedList<>();
        for(Genre genre : parents)
        {
            genre.children.add(this);
        }
    }

    public List<Genre> getParents() {
        return parents;
    }

    public List<Genre> getChildren()
    {
        return children;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || this.getClass()!=obj.getClass())
        {
            return false;
        }
        return this.name == ((Genre)obj).name;
    }

    @Override
    public String toString() {
        return name;
    }
}
