package com.cxx.s02;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author 陈喜喜
 * @date 2022-07-27 18:15
 */
@Aspect
@Component
public class MyAspectJ {
    /**
     * 后置通知的方法的规范
     * 1)访问权限是public
     * 2)方法没有返回值void
     * 3)方法名称自定义
     * 4)方法有参数(也可以没有参数，如果目标方法没有返回值，则可以写无参的方法,但一般会写有参
     * ,因为这样可以处理无参可以处理有参) ,这个切面方法的参数就是目标方法的返回值
     * 5)使用@AfterReturning注解表明是后置通知
     * 6)只有目标方法正常运行了（没有抛异常....）才会执行后置通知
     * 参数:
     * value:指定切入点表达式
     * returning:指定目标方法的返回值的名称，则名称必须与切面方法的参数名称一致.
     */
    @AfterReturning(value = "execution(* com.cxx.s02.*.*(..))",returning = "obj")
    public void myAfterReturning(Object obj){
        System.out.println("后置功能实现..........\n目标方法的返回值=" + obj);
        //测试8大普通类型是否可以在AfterReturning改变返回值
        if (obj != null) {
            if(obj instanceof String) {
                obj = obj.toString().toUpperCase();
                System.out.println("在切面方法中目标方法的返回值="+obj);
            }
            if (obj instanceof Student){
                Student stu = (Student) obj;
                stu.setName("李四");
                System.out.println("在切面方法中目标方法的返回值=" + stu);
            }
        }
    }
}
