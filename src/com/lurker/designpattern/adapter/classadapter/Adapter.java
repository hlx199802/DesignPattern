package com.lurker.designpattern.adapter.classadapter;

public class Adapter extends Source implements Target  {
    @Override
    public void method1() {
        super.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the target method");
    }
}
