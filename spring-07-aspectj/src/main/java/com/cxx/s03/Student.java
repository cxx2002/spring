package com.cxx.s03;

/**
 * @author 陈喜喜
 * @date 2022-07-27 18:31
 */
public class Student {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public Student(String name) {
        this.name = name;
    }
}
