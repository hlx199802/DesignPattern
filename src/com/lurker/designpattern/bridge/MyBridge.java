package com.lurker.designpattern.bridge;

public class MyBridge extends Bridege {

    @Override
    public void method() {
        getSource().method();
    }
}
