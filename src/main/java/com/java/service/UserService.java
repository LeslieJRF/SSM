package com.java.service;

import com.java.base.BaseService;
import com.java.dao.UserMapper;
import com.java.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User> {
    @Autowired
    private UserMapper userMapper;
}
