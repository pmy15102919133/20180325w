package com.xike.spribgboot20180325.controller;

import com.xike.spribgboot20180325.domain.User;
import com.xike.spribgboot20180325.mapper.UserMapper;
import com.xike.spribgboot20180325.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value="/api")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    //查询所有的员工
    @RequestMapping(value="/user")
    public String getUsers(){
        List<User> userlist = userService.getUser();
        System.out.println("也不知道查出来了没");
        System.out.println("诶！");
        System.out.println(userlist);
        return  null;
    }
    //插入员工
    @RequestMapping(value = "/in")
    @ResponseBody      //使用@ResponseBody返回json数据格式
    public String insertUser(){
    User user = new User("潘明勇","123456");
    userMapper.insertUser(user);
    return "员工插入成功！";
    }
    //删除某个员工
    @RequestMapping(value = "/out")
    @ResponseBody
    public  String deleteUser(){
        userMapper.deleteUser("pmy");
        return "删除成功！";
    }
   //修改某个员工的密码
    @RequestMapping("/update")
    @ResponseBody
    public String updateUser(){
        userMapper.updateUser("kkk","dsfds");
        return "员工的密码修改成功！";
    }
}
