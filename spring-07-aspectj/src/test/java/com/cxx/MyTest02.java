package com.cxx;

import com.cxx.s02.SomeService;
import com.cxx.s02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 陈喜喜
 * @date 2022-07-27 18:21
 */
public class MyTest02 {
    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");//jdk的Proxy类动态代理，只能用接口来接

        System.out.println(someService.getClass());

        String s = someService.doSome("张三", 20);

        System.out.println("最后目标方法的返回值是="+s+"\n");

        Student stu = someService.change();

        System.out.println("最后目标方法的返回值是="+stu);


    }
}
