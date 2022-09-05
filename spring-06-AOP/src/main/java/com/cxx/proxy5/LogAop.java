package com.cxx.proxy5;

/**
 * @author 陈喜喜
 */
public class LogAop implements AOP {
    @Override
    public void before() {
        System.out.println("日志输出............");
    }

}
