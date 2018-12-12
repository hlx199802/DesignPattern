package com.lurker.designpattern.adapter.interfaceadapter;

import com.lurker.designpattern.adapter.classadapter.Target;

public abstract class Wrapper implements Target {

    @Override
    public void method1() {}

    @Override
    public void method2() {}
}
