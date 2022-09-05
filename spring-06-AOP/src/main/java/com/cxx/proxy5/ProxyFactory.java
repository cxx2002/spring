package com.cxx.proxy5;

import com.cxx.proxy4.AOP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 陈喜喜
 */
public class ProxyFactory {
    //动态代理
    public static Object getAgent(Service target, AOP aop) {
        //返回生成的动态代理对象
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader()/*类加载器*/,
                target.getClass().getInterfaces()/*目标对象实现的所有的接口*/,
                new InvocationHandler() /*代理功能实现*/ {
                    @Override
                    public Object invoke(
                            Object proxy/*生成的代理对象*/,
                            Method method/*正在被调用的目标方法buy()、show()*/,
                            Object[] args/*目标方法的参数*/) throws Throwable {
                        Object obj = null;
                        try {
                            //切面
                            aop.before();//事务   日志
                            //业务
                            obj = method.invoke(target, args);
                            //切面
                            aop.after();
                        } catch (Exception e) {
                            //切面
                            aop.exception();
                        }
                        return obj;//目标方法的返回值
                    }
                }
        );
    }
}
