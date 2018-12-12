package com.lurker.designpattern.factory.methods;

import com.lurker.designpattern.factory.simple.MailSender;
import com.lurker.designpattern.factory.simple.Sender;
import com.lurker.designpattern.factory.simple.SmsSender;

public class SenderFactory {

    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }

}
