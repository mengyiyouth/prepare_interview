package com.mengyi.designpatterns.behavor.iterator.complex;

public interface SongIterator<E> {
    boolean hasNext();
    E next();
}
