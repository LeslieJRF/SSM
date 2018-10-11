package com.java.controller;

import com.java.po.User;
import com.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("queryUserById")
    @ResponseBody
    public User queryUser(Integer userId) throws Exception {
        return  userService.queryById(userId);
    }
}
