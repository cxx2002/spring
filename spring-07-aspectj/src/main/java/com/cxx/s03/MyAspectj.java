package com.cxx.s03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author 陈喜喜
 * @date 2022-07-27 18:52
 */
@Aspect
@Component
public class MyAspectj {
    /**
     * @around 环绕通知方法的规范
     * 1)访问权限是public
     * ?)切面方法有返回值，此返回值就是目标方法的返回值
     * 3)方法名称自定义
     * 4)方法有参数，此参数就是目标方法
     * 5)回避异常Throwable
     * 5)使用@Around注解声明是环绕通知
     * 参数:
     * value:指定切入点表达式
     */
    @Around(value = "execution(* com.cxx.s03.*.*(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        //前切功能的实现
        System.out.println("环绕通知的前置功能实现.............");
        //目标方法的调用
        Object obj = pjp.proceed(pjp.getArgs());//proceed会抛异常，因此要回避异常Throwable
        //后切功能的实现
        System.out.println("环绕通知的前置功能实现.............");
        //改变了目标方法的返回值
        return obj.toString().toUpperCase();
    }
}
