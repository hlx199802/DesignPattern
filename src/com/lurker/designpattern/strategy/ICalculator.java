package com.lurker.designpattern.strategy;

/**
 * 策略模式统一方法接口
 */
public interface ICalculator {

    /**
     * 策略模式统一方法
     * @param exp 表达式
     * @return
     */
    public int calculate(String exp);

}
