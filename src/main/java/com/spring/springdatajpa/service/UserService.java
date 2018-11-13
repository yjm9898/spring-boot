package com.spring.springdatajpa.service;

import com.spring.springdatajpa.entity.User;
import com.spring.springdatajpa.spring.result.Result;

/**
 * user crud
 */
public interface UserService {

    Result saveAll(User user);


}
