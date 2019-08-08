package cn.itcast.user.service;

import cn.itcast.user.dao.UserMapper;
import cn.itcast.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Desc TODO
 * @Date 2019/7/30
 * @Version 1.0
 **/
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User>  queryAllUser(){
        List<User> users = userMapper.selectAll();
        return users;
    }

}
