package com.cxx;

import com.cxx.proxy2.BookServiceImpl2;
import com.cxx.proxy2.SubBookServiceImpl;
import com.cxx.proxy3.Agent;
import com.cxx.proxy3.BookServiceImpl3;
import com.cxx.proxy3.ProductServiceImpl;
import com.cxx.proxy3.Service;
import org.junit.Test;

/**
 * @author 陈喜喜
 */
public class test {
    private final String name = "test";

    @Test
    public void test02(){
        BookServiceImpl2 service = new SubBookServiceImpl();
        service.buy();
    }
    @Test
    public void test03(){
        Service agent1 = new Agent(new BookServiceImpl3());
        agent1.buy();
        Service agent2 = new Agent(new ProductServiceImpl());
        agent2.buy();
    }

}
