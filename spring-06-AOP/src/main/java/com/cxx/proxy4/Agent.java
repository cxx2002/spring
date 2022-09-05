package com.cxx.proxy4;

public class Agent implements Service{
    //传入目标（业务对象），切面对象
    Service service;
    AOP aop;
    //使用构造方法初始化业务对象和切面对象
    public Agent(Service service, AOP aop) {
        this.service = service;
        this.aop = aop;
    }
    @Override
    public void buy() {
        try {
            //切面
            aop.before();//事务   日志....
            //业务
            service.buy();//图书   商品......
// /*静态代理的缺点就在这，只能事先都写好buy()和show()才能运行这两个方法*/
// /*动态代理就不需要，即使后面新加了一些方法，也可以直接运行新方法*/
            //切面
            aop.after();//事务    ......
        }catch (Exception e) {
            //切面
            aop.exception();
        }
    }
}
