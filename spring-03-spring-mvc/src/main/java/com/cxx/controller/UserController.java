package com.cxx.controller;

import com.cxx.pojo.Users;
import com.cxx.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 界面层----servlet
 */
public class UserController {
//切记：所用界面层都会有业务逻辑层的对象
    //private UserService userService = new UserServiceImpl();

    //由spring接管对象的创建（ioc控制反转）
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    //界面层的功能实现，对外提供访问功能
    public int insert(Users u){
        return userService.insert(u);
    }

    @Test
    public void test(){
        UserController userController = new UserController();
        int count = userController.insert(new Users(001, "张三", 20));
        System.out.println(count);
    }
    @Test
    public void test2(){
        //创建spring容器并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //取出对象
        UserController uController = (UserController)ac.getBean("uController");
        //测试功能
        int count = uController.insert(new Users(002, "李四", 19));
        System.out.println(count);
    }
}
