package com.ren.service;

import com.ren.dao.UserDao;
import com.ren.dao.UserDaoImpl;
import com.ren.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
