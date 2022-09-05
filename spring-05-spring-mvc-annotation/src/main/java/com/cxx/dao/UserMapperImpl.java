package com.cxx.dao;

import com.cxx.pojo.Users;
import org.springframework.stereotype.Repository;

@Repository//就是交给spring去创建数据访问层的对象
public class UserMapperImpl implements UsersMapper{
    @Override
    public int insert(Users u) {
        System.out.println(u.getUname()+"--------用户增加成功！");
        return 1;
    }
}
