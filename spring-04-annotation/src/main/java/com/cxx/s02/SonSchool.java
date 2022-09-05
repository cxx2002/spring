package com.cxx.s02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SonSchool extends School{
    @Value("成大附小")
    private String name;
    @Value("十陵街道")
    private String address;

    public SonSchool() {
        System.out.println("学校子类的构造方法");
    }

    @Override
    public String toString() {
        return "SonSchool{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
