package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import com.atguigu.spring5.dao.UserDaoImp;

/**
 * @author shkstart
 * @create 2021-10-01 17:34
 */
public class UserService {


    private UserDao userDao;



    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add.......");
    }

    public void show(){
        userDao.upDate();

        add();

    }


}
