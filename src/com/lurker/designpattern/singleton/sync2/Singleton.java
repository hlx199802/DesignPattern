package com.lurker.designpattern.singleton.sync2;

public class Singleton {

    private static Singleton instance = null;

    public Singleton() {
    }

    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
