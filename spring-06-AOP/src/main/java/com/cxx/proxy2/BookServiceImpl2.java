package com.cxx.proxy2;

/**
 * 使用子类代理的方式进行图书业务和事务切面的拆分
 * @author 陈喜喜
 */
public class BookServiceImpl2 {
    //在父类中只有干干净净的业务
    public void buy(){
        System.out.println("图书购买功能实现....................");
    }
}
