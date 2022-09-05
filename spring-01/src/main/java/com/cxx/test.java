package com.cxx;

import com.cxx.pojo.School;
import com.cxx.pojo.student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class test
{
    @Test
    public void testStudent() {//程序员创建对象
        student stu = new student();
        System.out.println(stu);
    }

    @Test
    public void testStudentSpring() {//由spring容器进行创建对象
        //如果想从spring容器取出对象，则先要创建容器对象，并且启动才可以取对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        student stu = (student) ac.getBean("stu");//getBean拿到的对象都是object，强制类型转换就可以了
        System.out.println(stu);
    }

    @Test
    public void testSchool2Spring() {//由spring容器进行创建对象
        //如果想从spring容器取出对象，则先要创建容器对象，并且启动才可以取对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        School school2 = (School) ac.getBean("school2");//getBean拿到的对象都是object，强制类型转换就可以了
        System.out.println(school2);
    }

    @Test
    public void testSchool3Spring() {//由spring容器进行创建对象
        //如果想从spring容器取出对象，则先要创建容器对象，并且启动才可以取对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        School school3 = (School) ac.getBean("school3");//getBean拿到的对象都是object，强制类型转换就可以了
        System.out.println(school3);
    }

    @Test
    public void testStudent2Spring() {//由spring容器进行创建对象
        //如果想从spring容器取出对象，则先要创建容器对象，并且启动才可以取对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        student stu2 = (student) ac.getBean("stu2");//getBean拿到的对象都是object，强制类型转换就可以了
        System.out.println(stu2);
    }
}
