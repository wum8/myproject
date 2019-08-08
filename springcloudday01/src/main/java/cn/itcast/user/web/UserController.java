package cn.itcast.user.web;

import cn.itcast.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Desc TODO
 * @Author wander_wum
 * @Date 2019/7/30
 * @Version 1.0
 **/
@RestController
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public List queryallUser(){
       return userService.queryAllUser();
    }
}
