package com.cxx.proxy4;

/**
 * @author 陈喜喜
 */
public class TransAop implements AOP{
    @Override
    public void before() {
        System.out.println("事务开启.............");
    }

    @Override
    public void after() {
        System.out.println("事务提交.............");
    }

    @Override
    public void exception() {
        System.out.println("事务回滚.............");
    }
}
