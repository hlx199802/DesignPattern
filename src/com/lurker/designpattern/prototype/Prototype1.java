package com.lurker.designpattern.prototype;

import java.io.Serializable;

public class Prototype1 implements Cloneable, Serializable {

    private String string;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }
}
