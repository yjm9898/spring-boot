package com.spring.springdatajpa.service;

import com.spring.springdatajpa.entity.User;
import com.spring.springdatajpa.repository.UserRepository;
import com.spring.springdatajpa.spring.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public Result saveAll(User user) {
        User db = userRepository.save(user);
        return Result.success(db);
    }
}
