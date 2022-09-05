package com.cxx.s01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component//@Component("name")就是创建了一个name的学生对象，不写默认就是类名的驼峰命名法
public class Student {

    @Value("张三")
    private String name;
    @Value("20")//语法@value("")
    private int age;
    @Autowired//引用类型的注入(按类型注入,需要有School对象也创建)
    @Qualifier("newSchool")//按名称
    // 注入，不能单独使用
    private School school;

    public Student() {
        System.out.println("学生的无参构造方法......");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
