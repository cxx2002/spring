package com.cxx.s04;

import org.springframework.stereotype.Component;

/**
 * @author 陈喜喜
 * @date 2022-07-27 16:41
 * 业务实现类
 */
@Component //用注解的方法生成对象
public class SomeServiceImpl implements SomeService {
    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome的业务功能实现......"+"doSome=" + name + "age=" + age);
        return "abc";
    }

    @Override
    public void show() {
        System.out.println("show()方法执行...........");
    }
}
