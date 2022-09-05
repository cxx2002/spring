package com.cxx;

import com.cxx.s01.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("s01/applicationContext.xml");

        SomeService someService = (SomeService) ac.getBean("someServiceImpl");//jdk的Proxy类动态代理，只能用接口来接

        /*SomeServiceImpl someService = (SomeServiceImpl) someService.getBean("someService");ac.getBean("someService");*/
        /*设置了proxy-target-class="true"会转换会子类代理CGLib的方式，这样可以用实现类或者接口来接*/

        System.out.println(someService.getClass());

        String s = someService.doSome("张三", 20);
        System.out.println(s);

        someService.show();
    }
}
