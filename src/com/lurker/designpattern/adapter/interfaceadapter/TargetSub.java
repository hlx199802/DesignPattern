package com.lurker.designpattern.adapter.interfaceadapter;

public class TargetSub extends Wrapper {

    @Override
    public void method1() {
        System.out.println("this method is adapter of method1");
    }
}
