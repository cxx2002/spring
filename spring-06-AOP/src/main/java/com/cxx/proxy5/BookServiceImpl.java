package com.cxx.proxy5;

/**
 * @author 陈喜喜
 */
public class BookServiceImpl implements Service {
    @Override
    public String show(int age) {
        System.out.println("show()方法被调用......参数age="+age);
        return "abc";
    }

    @Override
    public void buy() {
        System.out.println("图书购买业务功能实现.........................");
    }
}
