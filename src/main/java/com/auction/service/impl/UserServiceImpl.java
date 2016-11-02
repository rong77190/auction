package com.auction.service.impl;


import com.auction.common.BaseServiceImpl;
import com.auction.common.PageBean;
import com.auction.dao.UserMapper;
import com.auction.entity.User;
import com.auction.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl extends BaseServiceImpl<User,UserMapper> implements UserService {

    @Resource
    UserMapper userMapper;


    public List<User> selectUserList() {
        return userMapper.getUserList();
    }

    public User getByUserName(String userName) {
        return userMapper.getByUserName(userName);
    }

    public Set<String> getRoles(String userName) {
        return userMapper.getRoles(userName);
    }

    public Set<String> getPermissions(String userName) {
        return userMapper.getPermissions(userName);
    }


    public void setDao(UserMapper dao) {
        this.dao = userMapper;
    }


}
