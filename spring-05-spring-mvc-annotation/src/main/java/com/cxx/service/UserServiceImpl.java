package com.cxx.service;

import com.cxx.dao.UsersMapper;
import com.cxx.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//就是交给spring去创建对象
public class UserServiceImpl implements UserService{
    //private UsersMapper usersMapper = new UserMapperImpl();
//切记：所用业务逻辑层中都必定有数据访问层的对象

    /*//spring接管创建对象(ioc控制反转)
    private UsersMapper usersMapper;

    public void setUsersMapper(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }
*/
@Autowired//只有一个UsersMapper对象，所以自动匹配了
    private UsersMapper usersMapper;

    @Override
    public int insert(Users u) {
        return usersMapper.insert(u);//现在只是模拟的业务，dao层也没有用Mybatis
    }
}
