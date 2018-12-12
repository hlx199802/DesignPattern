package com.lurker.designpattern.singleton.simple;

public class Singleton {

    private static Singleton instance = null;

    public Singleton() {
    }

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public Object readResolve() {
        return instance;
    }

}
