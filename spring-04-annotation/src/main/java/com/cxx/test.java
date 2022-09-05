package com.cxx;

import com.cxx.s02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) ac.getBean("stu");
        System.out.println(student);
    }
}
