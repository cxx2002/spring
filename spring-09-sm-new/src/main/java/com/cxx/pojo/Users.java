package com.cxx.pojo;

/**
 * @author 陈喜喜
 * @date 2022-07-30 17:48
 */
public class Users {
    private Integer userid;
    private String username;
    private String upass;

    public Users() {
    }

    public Users(Integer userid, String username, String upass) {
        this.userid = userid;
        this.username = username;
        this.upass = upass;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", upass='" + upass + '\'' +
                '}';
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }
}
