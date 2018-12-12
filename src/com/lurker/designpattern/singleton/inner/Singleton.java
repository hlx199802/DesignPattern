package com.lurker.designpattern.singleton.inner;

public class Singleton {

    public Singleton() {
    }

    private static class SingletonFactory {
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonFactory.instance;
    }

    public Object readResolve() {
        return getInstance();
    }

}
