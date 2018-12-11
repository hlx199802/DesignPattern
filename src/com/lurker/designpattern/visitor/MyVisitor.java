package com.lurker.designpattern.visitor;

public class MyVisitor implements Visitor {
    @Override
    public void visit(Subject sub) {
        System.out.println("Visit the subject: " + sub.getSubject());
    }
}
