package com.cxx.service.impl;

import com.cxx.mapper.AccountsMapper;
import com.cxx.pojo.Accounts;
import com.cxx.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 陈喜喜
 * @date 2022-07-30 17:55
 */
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class AccountsServiceImpl implements AccountsService {
    //切记切记:在所有的业务逻辑层中一定会有数据访问层的对象
    @Autowired  //按类型注入，在spring已经生成好了一个这样的对象，直接拿来用
            AccountsMapper accountsMapper;
    @Override
    public int save(Accounts account) {
        int num = 0;
        num = accountsMapper.save(account);
        System.out.println("增加账户成功！num: " + num);
        //手动制造错误异常
        System.out.println(1/0);
        return num;
    }
}
