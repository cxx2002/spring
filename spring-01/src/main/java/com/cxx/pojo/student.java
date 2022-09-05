package com.cxx.pojo;

public class student {
//用spring容器创建对象，对象必须要有无参构造方法
//用spring容器给创建的对象赋值，对象必须要有相应的setter方法
    private String name;
    private int age;
    private School school;//引用类型的注入

    public void setSchool(School school) {
        this.school = school;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    public student() {
        System.out.println("学生的无参构造方法..........");
    }

    public student(String name, int age, School school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
