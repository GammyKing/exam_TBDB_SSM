package com.service.impl;

import com.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import com.pojo.User;
import com.service.UserService;
import com.util.DateFormatUtil;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
 * @author xhz
 * @description 业务接口实现类
 * @date 2021-01-20
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
//    查找数据库是否有该对象
    public boolean checkLogin(User user) {
        User dbUser = userDao.queryUser(user);
        boolean result;
        result = dbUser != null;
        return result;
    }

//    注册入库
    @Override
    public boolean register(User user) {
        Date date = new Date();
//        设置三个固定属性
        user.setId(UUID.randomUUID().toString());
        user.setCreatetime(DateFormatUtil.getDateFormat().toString());
        user.setIsdelete(0);
        int i = userDao.registerUser(user);
        return i != 0;
    }



}
