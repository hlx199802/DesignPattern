package com.lurker.designpattern.adapter.objectadapter;

import com.lurker.designpattern.adapter.classadapter.Source;
import com.lurker.designpattern.adapter.classadapter.Target;

public class Test {

    public static void main(String[] args) {
        Source source = new Source();
        Target target = new Wrapper(source);
        target.method1();
        target.method2();
    }

}
