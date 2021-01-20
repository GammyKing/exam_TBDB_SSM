package dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pojo.User;

/**
 * @author xhz
 * @description 用户数据库交互
 * @date 2021-01-20
 */
@Mapper
public interface UserDao {
    User queryUser(User user);
    int registerUser(User user);
}
