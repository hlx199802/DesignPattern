package com.lurker.designpattern.adapter.classadapter;

public class Test {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.method1();
        target.method2();
    }

}
