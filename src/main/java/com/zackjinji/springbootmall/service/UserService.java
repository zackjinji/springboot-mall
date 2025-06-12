package com.zackjinji.springbootmall.service;

import com.zackjinji.springbootmall.dto.UserRegisterRequest;
import com.zackjinji.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

}
