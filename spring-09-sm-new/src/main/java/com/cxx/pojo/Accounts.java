package com.cxx.pojo;

/**
 * @author 陈喜喜
 * @date 2022-07-30 17:49
 */
public class Accounts {
    private Integer aid;
    private String aname;
    private String acontent;

    public Accounts() {
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", acontent='" + acontent + '\'' +
                '}';
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAcontent() {
        return acontent;
    }

    public void setAcontent(String acontent) {
        this.acontent = acontent;
    }

    public Accounts(Integer aid, String aname, String acontent) {
        this.aid = aid;
        this.aname = aname;
        this.acontent = acontent;
    }
}
