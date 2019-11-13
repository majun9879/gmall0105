package com.gmall.user.service.impl;

import com.gmall.user.mapper.UserMapper;
import com.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Name UserServiceImpl
 * @Description TODO
 * @Author MaJun
 * @Data 2019/11/13 17:16
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
}
