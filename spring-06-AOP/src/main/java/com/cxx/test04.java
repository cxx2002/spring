package com.cxx;

import com.cxx.proxy4.*;
import org.junit.Test;

/**
 * @author 陈喜喜
 */
public class test04 {
    @Test
    public void test() {
        Service agent = new Agent(new ProductServiceImpl(), new TransAop());
        agent.buy();        System.out.println("————————————————");
        /*多个切面的切入*/
        Service ag = new Agent(agent, new LogAop());
        ag.buy();        System.out.println("————————————————");
        Service agent2 = new Agent(new BookServiceImpl(), new LogAop());
        agent2.show(22);
        //静态代理的缺点
        agent2.buy();        System.out.println("————————————————");
    }
}
