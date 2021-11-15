package com.GoldeRoX;

public interface MyCollection<T> {
    void add(T element);
    void remove(T element);
    MyIterator<T> iterator();
}
