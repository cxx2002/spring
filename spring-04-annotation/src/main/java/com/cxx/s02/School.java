package com.cxx.s02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("newSchool")
public class School {
    @Value("成都大学")
    private String name;
    @Value("龙泉驿区")
    private String address;

    public School(){
        System.out.println("学校的无参构造方法...............");
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
