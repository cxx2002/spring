package com.cxx.service;

import com.cxx.dao.UserMapperImpl;
import com.cxx.dao.UsersMapper;
import com.cxx.pojo.Users;

public class UserServiceImpl implements UserService{
    private UsersMapper usersMapper = new UserMapperImpl();
//切记：所用业务逻辑层中都必定有数据访问层的对象
    @Override
    public int insert(Users u) {
        return usersMapper.insert(u);//现在只是模拟的业务，dao层也没有用Mybatis
    }
}
