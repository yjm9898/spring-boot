package com.spring.springdatajpa.controller;

import com.spring.springdatajpa.entity.User;
import com.spring.springdatajpa.service.UserService;
import com.spring.springdatajpa.spring.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/save")
    public Result save(User user){
        return  userService.saveAll(user);
    }

}
