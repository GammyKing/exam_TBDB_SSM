package service;

import org.springframework.stereotype.Service;
import pojo.User;

/**
 * @author xhz
 * @description 用户业务逻辑
 * @date 2021-01-20
 */
@Service
public interface UserService {
   boolean checkLogin(User user);
   boolean register(User user);
}
