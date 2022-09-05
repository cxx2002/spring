package com.cxx.controller;

import com.cxx.pojo.Users;
import com.cxx.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * 界面层----servlet
 */
@Controller//就是交给spring去创建对象
public class UserController {
//切记：所用界面层都会有业务逻辑层的对象
    //private UserService userService = new UserServiceImpl();

    /*//由spring接管对象的创建（ioc控制反转）
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }*/

    @Autowired//只有一个UserService对象，所以自动匹配了
    private UserService userService;


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
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_controller.xml");
        //取出对象
        UserController uController = (UserController)ac.getBean("uController");
        //测试功能
        int count = uController.insert(new Users(002, "李四", 19));
        System.out.println(count);
    }
}
