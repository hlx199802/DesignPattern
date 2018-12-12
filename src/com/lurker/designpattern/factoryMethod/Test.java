package com.lurker.designpattern.factoryMethod;

public class Test {

    public static void main(String[] args) {
        Provider provider = new MailSenderFactory();
        Sender sender = provider.produce();
        sender.send();
    }

}
