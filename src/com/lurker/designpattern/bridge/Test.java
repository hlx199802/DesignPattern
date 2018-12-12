package com.lurker.designpattern.bridge;

public class Test {

    public static void main(String[] args) {
        Bridege bridge = new MyBridge();

        Sourceable source1 = new SourceSub1();
        bridge.setSource(source1);
        bridge.method();
    }

}
