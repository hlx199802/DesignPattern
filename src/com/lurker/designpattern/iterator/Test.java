package com.lurker.designpattern.iterator;

public class Test {

    public static void main(String [] args) {
        Collection collection = new MyCollection();
        Iterator iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
