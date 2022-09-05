package com.cxx.pojo;

public class Users {
    private int uid;
    private String uname;
    private int uage;

    public Users() {
        System.out.println("Users的无参构造函数.................");
    }

    public Users(int uid, String uname, int uage) {
        this.uname = uname;
        this.uid = uid;
        this.uage = uage;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setUage(int uage) {
        this.uage = uage;
    }

    @Override
    public String toString() {
        return "Users{" +
                "uname='" + uname + '\'' +
                ", uid=" + uid +
                ", uage=" + uage +
                '}';
    }

    public String getUname() {
        return uname;
    }

    public int getUid() {
        return uid;
    }

    public int getUage() {
        return uage;
    }
}
