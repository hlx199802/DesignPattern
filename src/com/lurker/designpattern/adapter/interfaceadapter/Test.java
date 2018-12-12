package com.lurker.designpattern.adapter.interfaceadapter;

import com.lurker.designpattern.adapter.classadapter.Target;

public class Test {

    public static void main(String[] args) {
        Target target = new TargetSub();
        target.method1();
    }

}
