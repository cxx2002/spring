package com.cxx;

import com.cxx.s03.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 陈喜喜
 * @date 2022-07-27 19:02
 */
public class MyTest03 {
    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("s03/applicationContext.xml");
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");//jdk的Proxy类动态代理，只能用接口来接

        String s = someService.doSome("张三",20);
        System.out.println("目标方法最终的返回值="+s);
    }
}
