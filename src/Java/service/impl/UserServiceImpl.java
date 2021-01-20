package service.impl;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import pojo.User;
import service.UserService;
import util.DateFormatUtil;

import java.util.Date;
import java.util.UUID;

/**
 * @author xhz
 * @description 业务接口实现类
 * @date 2021-01-20
 */
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
//  用户查看信息  传入参数为acc
    @Override
    public User userCheckInfo(User user) {
        return userDao.CheckInfo(user);
    }
//   用户修改信息
//    前端需要判定回传的内容是否为空
    @Override
    public User modifyInfo(User user) {
        int i = userDao.modifyInfo(user);
        User resultUser = null;
        if(i!=0){
//            success
            resultUser = userDao.modifyInfoSelect(user.getAcc());
        }
        return resultUser;
    }

//    用户修改密码
    @Override
    public boolean modifyPwd(User user) {
        int i = userDao.modifyPwd(user);
        return i != 0;
    }

//    用户忘记密码
    @Override
    public boolean forgetPwd(User user) {
//       先确定该账户存在
        boolean result = false;
        User exitUser = userDao.forgetSelectUser(user);
        if (exitUser!=null){
           result = true;
        }
        return result;
    }


}
