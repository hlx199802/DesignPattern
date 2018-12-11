package com.lurker.designpattern.templatemethod;

public class TemplateMethodTest {

    public static void main(String [] args) {
        AbstractCalculator calculator = new Plus();
        int result = calculator.calculate("2+8", "\\+");
        System.out.println(result);
    }

}
