package com.mengyi.designpatterns.behavor.iterator.complex;

public class TestSongPlayListIterator {
    public static void main(String[] args) {
        SongPlayList songPlayList = new SongPlayList(5);
        songPlayList.addSong("song1");
        songPlayList.addSong("song2");
        songPlayList.addSong("song3");

        SongPlaylistIterator songPlaylistIterator =  new SongPlaylistIterator(songPlayList);
        while (songPlaylistIterator.hasNext()){
            System.out.println(songPlaylistIterator.next());
        }
    }
}
