package com.cxx.pojo;

public class School {
    private String name;
    private Integer year;
    private String address;

    public School() {
        System.out.println("学校的构造方法.......");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public School(String name1, Integer year1, String address1) {
        this.name = name1;
        this.year = year1;
        this.address = address1;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", address='" + address + '\'' +
                '}';
    }
}
