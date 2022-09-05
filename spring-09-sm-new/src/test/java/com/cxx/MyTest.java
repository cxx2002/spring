package com.cxx;

import com.cxx.pojo.Accounts;
import com.cxx.pojo.Users;
import com.cxx.service.AccountsService;
import com.cxx.service.UsersService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 陈喜喜
 * @date 2022-07-30 17:47
 */
public class MyTest {
    @Test
    public void test1() {
        //创建容器并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
        //取出UsersServiceImpl
        UsersService usersService = (UsersService) ac.getBean("usersServiceImpl");
        int num = usersService.insert(new Users(105, "张三5", "1234"));
        System.out.println("num=" + num);
    }
    @Test
    public void test2() {
        //创建容器并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
        //取出UsersServiceImpl
        AccountsService accountsService = (AccountsService) ac.getBean("accountsServiceImpl");
        accountsService.save(new Accounts(204, "李四4", "账户安全4!"));
        System.out.println(accountsService.getClass());
    }
}
