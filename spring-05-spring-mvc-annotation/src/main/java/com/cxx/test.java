package com.cxx;

import com.cxx.controller.UserController;
import com.cxx.pojo.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test2(){
        //创建spring容器并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("total.xml");
        //取出对象
        UserController uController = (UserController)ac.getBean("userController");//默认的驼峰命名法
        //测试功能
        int count = uController.insert(new Users(002, "李四", 19));
        System.out.println(count);
    }
}
