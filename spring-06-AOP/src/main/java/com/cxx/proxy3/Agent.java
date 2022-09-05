package com.cxx.proxy3;

/**
 * 静态代理已经实现了目标对象的灵活切换
 * 图书购买业务，商品购买业务
 */
public class Agent implements Service{
    //设计成员变量的类型为接口，为了灵活切换目标对象
    private final Service target;
    //使用构造方法传入目标对象
    public Agent(Service target) {
        this.target = target;
    }
    @Override
    public void buy() {
        try {
            //切面功能
            System.out.println("事务开启..........");
            //业务功能
            target.buy();
            //切面功能
            System.out.println("事务提交..........");
        }catch (Exception e) {
            System.out.println("事务回滚..........");
        }
    }
}
