package com.zackjinji.springbootmall.service.impl;

import com.zackjinji.springbootmall.dao.UserDao;
import com.zackjinji.springbootmall.dto.UserRegisterRequest;
import com.zackjinji.springbootmall.model.User;
import com.zackjinji.springbootmall.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
public class UserServiceImpl implements UserService {

   private final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
//        檢查註冊的Email
        User user = userDao.getUserByEmail(userRegisterRequest.getEmail());

        if(user != null) {
            logger.warn("該 Email {} 已經被註冊", userRegisterRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
//          註冊
        return userDao.createUser(userRegisterRequest);
    }
}
