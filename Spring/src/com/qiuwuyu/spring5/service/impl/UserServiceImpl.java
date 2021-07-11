package com.qiuwuyu.spring5.service.impl;

import com.qiuwuyu.spring5.dao.UserDao;
import com.qiuwuyu.spring5.dao.impl.UserDaoImpl;
import com.qiuwuyu.spring5.service.UserService;

/**
 * @author paralog
 * @date 2021/7/11 9:56
 */
public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();

    @Override
    public int saveUser() {
        System.out.println("service方法调用");
        int i = dao.saveUser();
        return i;
    }

    public void setDao(UserDao dao){
        this.dao = dao;
    }
}
