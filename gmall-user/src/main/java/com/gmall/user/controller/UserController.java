package com.gmall.user.controller;

import com.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Name UserController
 * @Description TODO
 * @Author MaJun
 * @Data 2019/11/13 17:14
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;


}
