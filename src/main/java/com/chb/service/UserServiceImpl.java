package com.chb.service;

import com.chb.dao.UserDao;
import com.chb.dao.UserDaoImpl;
import com.chb.dao.UserDaoMySqlImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
