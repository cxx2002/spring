package com.cxx.service.impl;

import com.cxx.mapper.UsersMapper;
import com.cxx.pojo.Users;
import com.cxx.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 陈喜喜
 * @date 2022-07-30 12:11
 */
@Service  //交给spring去创建对象
public class UsersServiceImpl implements UsersService {
    //切记切记:在所有的业务逻辑层中一定会有数据访问层的对象
    /**  原生mybatis的处理方法
         //1.读取核心配置文件
         InputStream in = Resources . ge tResourceAsSt ream ("SqlMapConfig. xmI") ;
         //2.创建工厂对象
         SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in) ;
         //3.取出sqlSession
         sqlSession = factory. openSession(true) ;//自动提交事务
         //4. 取出动态代理的对象， 完成接口中方法的调用，实则是调用xml文件中相的标签的功能
         uMapper = sqlSess ion. ge tMapper (UsersMapper. class) ;
     */
    @Autowired  //按类型注入，在spring已经生成好了一个这样的对象，直接拿来用
    public UsersMapper usersMapper;

    public UsersServiceImpl(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    @Override
    public int insert(Users users) {
        return usersMapper.insert(users);
    }
}
