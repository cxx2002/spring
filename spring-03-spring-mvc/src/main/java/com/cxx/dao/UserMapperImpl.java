package com.cxx.dao;

import com.cxx.pojo.Users;

public class UserMapperImpl implements UsersMapper{
    @Override
    public int insert(Users u) {
        System.out.println(u.getUname()+"--------用户增加成功！");
        return 1;
    }
}
