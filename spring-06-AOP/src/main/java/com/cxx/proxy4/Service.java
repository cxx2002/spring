package com.cxx.proxy4;

/**
 * @author 陈喜喜
 */
public interface Service {
    void buy();
    default String show(int age){return null;}
}
