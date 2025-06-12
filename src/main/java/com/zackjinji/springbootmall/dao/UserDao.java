package com.zackjinji.springbootmall.dao;

import com.zackjinji.springbootmall.dto.UserRegisterRequest;
import com.zackjinji.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserByEmail(String email);
}
