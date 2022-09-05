package com.cxx.proxy4;

/**
 * @author 陈喜喜
 */
public interface AOP {
    //default可以让实现类不一定要实现所有的接口方法
    //default叫做默认实现
    default void before(){/*默认实现的方法体*/}

    default void after(){}

    default void exception(){}
}
