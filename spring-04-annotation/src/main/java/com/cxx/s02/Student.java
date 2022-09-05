package com.cxx.s02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stu")
public class Student {

    @Value("李四")
    private String name;
    @Value("23")//语法@value("")
    private int age;
    @Autowired//引用类型的注入(按类型注入,需要有School对象也创建)
    @Qualifier("sonSchool")//按名称注入，不能单独使用
    //这里用了School的子类SonSchool来注入，会先调用父类的构造方法再调用子类的构造方法
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
