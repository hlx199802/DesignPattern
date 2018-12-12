package com.lurker.designpattern.factory.methods;

import com.lurker.designpattern.factory.simple.Sender;

public class FactoryTest {

    public static void main(String[] args) {
        SenderFactory factory = new SenderFactory();
        Sender sender = factory.produceMail();
        sender.send();
    }

}
