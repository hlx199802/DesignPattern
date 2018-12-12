package com.lurker.designpattern.factory.staticmethods;

import com.lurker.designpattern.factory.simple.Sender;

public class FactoryTest {

    public static void main(String[] args) {
        Sender sender = SenderFactory.produceMail();
        sender.send();
    }

}
