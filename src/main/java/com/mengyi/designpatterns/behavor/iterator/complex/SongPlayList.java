package com.mengyi.designpatterns.behavor.iterator.complex;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class SongPlayList implements PlayList{
    private String[] songs;
    private int size;

    public SongPlayList(int capacity){
        this.songs = new String[capacity];
        this.size = 0;
    }

    public String[] getSongs() {
        return songs;
    }

    public void setSongs(String[] songs) {
        this.songs = songs;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addSong(String song){
        if(size < songs.length){
            this.songs[size++] = song;
        }else{
            System.out.println("the palylist is full");
        }
    }

    @Override
    public SongIterator createIterator() {
        return new SongPlaylistIterator(this);
    }
}
