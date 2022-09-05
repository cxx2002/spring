package com.cxx.s04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author 陈喜喜
 * @date 2022-07-28 10:15
 */
@Aspect
@Component
public class MyAspectJ {
    /**
     * 最终通知方法的规范
     * 1)访问权限是public
     * 2)方法没有返回值
     * 3)方法名称自定义
     * 4)方法没有参数，如果有也只能是JoinPoint
     * 5)使用@After注解表明是最终通知
     * 6)不管目标方法也没有正常运行，也没有抛异常，都会运行，相当于finally
     * 参数:
     * value:指定切入点表达式
     */
    @After(value = "myCut()")
    public void myAfter(){
        System.out.println("最终功能的实现");
        //System.out.println(1/0);//制造错误
    }

    @Before(value = "myCut()")
    public void before(){
        System.out.println("前置功能的实现");
    }
    @AfterReturning(value = "myCut()")
    public void afterReturning(){
        System.out.println("后置功能的实现");
    }
    @Around(value = "myCut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前置置功能的实现");
        Object obj = pjp.proceed(pjp.getArgs());
        System.out.println("环绕后置置功能的实现");
        return obj;
    }

    @Pointcut(value = "execution(* com.cxx.s04.*.*(..))")
    public void myCut() {}//为execution(* com.cxx.s04.*.*(..))取别名叫myCut()
}
