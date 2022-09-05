package com.cxx.proxy2;

public class SubBookServiceImpl extends BookServiceImpl2 {
    @Override
    public void buy() {
        try {
            //事务切面
            System.out.println("事务开启..........");
            //主业务实现
            super.buy();
            //事务切面
            System.out.println("事务提交..........");
        }catch (Exception e) {
            System.out.println("事务回滚..........");
        }
    }
}
