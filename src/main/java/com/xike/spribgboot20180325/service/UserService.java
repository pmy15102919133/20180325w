package com.xike.spribgboot20180325.service;

import com.xike.spribgboot20180325.domain.User;
import com.xike.spribgboot20180325.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@Service("userService")
public class UserService {

    @Autowired
   private UserMapper userMapper;

    public List<User> getUser(){
//查询所有的员工
        return  userMapper.findAll();
    }

}
