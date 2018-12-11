package com.lurker.designpattern.observer;

/**
 * 主对象接口
 */
public interface Subject {

    /**
     * 增加观察者
     * @param observer
     */
    public void add(Observer observer);

    /**
     * 删除观察者
     * @param observer
     */
    public void del(Observer observer);

    /**
     * 通知所有观察者
     */
    public void notifyObservers();

    /**
     * 自身的操作
     */
    public void operation();

}
