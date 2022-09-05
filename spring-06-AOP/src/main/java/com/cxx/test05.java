package com.cxx;

import com.cxx.proxy4.LogAop;
import com.cxx.proxy4.TransAop;
import com.cxx.proxy5.BookServiceImpl;
import com.cxx.proxy5.ProductServiceImpl;
import com.cxx.proxy5.ProxyFactory;
import com.cxx.proxy5.Service;
import org.junit.Test;

/**
 * @author 陈喜喜
 */
public class test05 {
    @Test
    public void test() {
        //得到动态代理的对象
        Service agent = (Service) ProxyFactory.getAgent(new BookServiceImpl(),new TransAop());
        agent.buy();        System.out.println("________________________________");
        Service agent2 = (Service) ProxyFactory.getAgent(new ProductServiceImpl(),new LogAop());
        agent2.buy();        System.out.println("________________________________");
        Service agent3 = (Service) ProxyFactory.getAgent(new BookServiceImpl(),new TransAop());
        agent3.show(20);
    }
}
