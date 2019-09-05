package com.cd.cmall.service.sys.impl;

import com.cd.cmall.entity.sys.User;
import com.cd.cmall.mapper.sys.UserMapper;
import com.cd.cmall.service.sys.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User load(int id) {
        return userMapper.load(id);
    }
}
