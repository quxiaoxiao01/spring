package com.qiuwuyu.spring5.dao.impl;

import com.qiuwuyu.spring5.dao.UserDao;

/**
 * @author paralog
 * @date 2021/7/11 9:55
 */
public class UserDaoImpl implements UserDao {

    @Override
    public int saveUser() {
        System.out.println("dao方法调用");
        return 1;
    }
}
