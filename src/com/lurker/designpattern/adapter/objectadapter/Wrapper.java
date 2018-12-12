package com.lurker.designpattern.adapter.objectadapter;

import com.lurker.designpattern.adapter.classadapter.Source;
import com.lurker.designpattern.adapter.classadapter.Target;

public class Wrapper implements Target {

    private Source source;

    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the target method");
    }
}
