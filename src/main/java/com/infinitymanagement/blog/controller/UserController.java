package com.infinitymanagement.blog.controller;

import com.infinitymanagement.blog.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * User Service
     */
    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }


}
