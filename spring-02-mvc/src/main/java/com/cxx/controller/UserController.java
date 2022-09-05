package com.cxx.controller;

import com.cxx.pojo.Users;
import com.cxx.service.UserService;
import com.cxx.service.UserServiceImpl;
import org.junit.Test;

/**
 * 界面层----servlet
 */
public class UserController {
//切记：所用界面层都会有业务逻辑层的对象
    private UserService userService = new UserServiceImpl();

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
}
