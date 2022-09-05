package com.cxx.s02;

import org.springframework.stereotype.Service;

/**
 * @author 陈喜喜
 * @date 2022-07-27 18:14
 */
@Service
public class SomeServiceImpl implements SomeService{
    @Override
    public Student change() {
        System.out.println("change()业务执行..............");
        return new Student("张三");
    }

    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome()方法被执行.........");
        return "abc";
    }
}
