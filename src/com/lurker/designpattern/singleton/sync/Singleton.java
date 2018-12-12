package com.lurker.designpattern.singleton.sync;

public class Singleton {

    private static Singleton instancce = null;

    public Singleton() {
    }

    public static synchronized Singleton getInstancce() {
        if(instancce == null) {
            instancce = new Singleton();
        }
        return instancce;
    }

}
