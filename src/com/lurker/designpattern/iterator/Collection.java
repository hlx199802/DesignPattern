package com.lurker.designpattern.iterator;

public interface Collection {

    public Iterator iterator();

    public Object get(int i);

    public int size();

}
