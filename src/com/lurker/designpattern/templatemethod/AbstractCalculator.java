package com.lurker.designpattern.templatemethod;

/**
 * 模板方法模式抽象类
 * 其中的方法calculate(String, String)和方法split(String, String)都是模板方法，其所有实现类共用
 * 方法calculate(int, int)由其子类重写实现
 */
public abstract class AbstractCalculator {

    public final int calculate(String exp, String opt) {
        int array[] = split(exp, opt);
        return calculate(array[0], array[1]);
    }

    public abstract int calculate(int num1, int num2);

    public int[] split(String exp, String opt) {
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }

}
