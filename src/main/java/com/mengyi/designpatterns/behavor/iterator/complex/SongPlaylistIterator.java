package com.mengyi.designpatterns.behavor.iterator.complex;

public class SongPlaylistIterator implements SongIterator<String>{
    private SongPlayList songPlayList;
    private int cursor = 0;

    public SongPlaylistIterator(SongPlayList songPlayList){
        this.songPlayList = songPlayList;
    }
    @Override
    public boolean hasNext() {
        if(cursor < songPlayList.getSize()){
            return true;
        }
        return false;
    }

    @Override
    public String next() {
        return songPlayList.getSongs()[cursor++];
    }
}
