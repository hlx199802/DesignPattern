package com.lurker.designpattern.factory.staticmethods;

import com.lurker.designpattern.factory.simple.MailSender;
import com.lurker.designpattern.factory.simple.Sender;
import com.lurker.designpattern.factory.simple.SmsSender;

public class SenderFactory {

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }

}
