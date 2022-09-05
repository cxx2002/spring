package com.cxx;

import com.cxx.s04.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 陈喜喜
 * @date 2022-07-28 10:21
 */
public class MyTest04 {
    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("s04/applicationContext.xml");
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");//jdk的Proxy类动态代理，只能用接口来接

        someService.doSome("张三",20);
    }
}
