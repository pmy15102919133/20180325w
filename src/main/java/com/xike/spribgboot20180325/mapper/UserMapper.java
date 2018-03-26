package com.xike.spribgboot20180325.mapper;

import com.xike.spribgboot20180325.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Mapper
public interface UserMapper {
    //查询所有的员工
    @Select(value = {"select * from springboot_user"})
    public List<User> findAll();
    //插入新的员工
    //错点：查询语句中的字段要与实体类中的字段一致，并且有get与set方法
    @Insert(value={"insert into springboot_user values(#{username},#{userpass})"})
    public void insertUser(User user);
    //删除某个员工
    @Delete(value={"delete from springboot_user where username=#{username}"})
    public void deleteUser(@Param("username") String username);
    //修改某个员工的密码
    @Update(value = {"update springboot_user set userpass = #{upass} where username = #{uname} "})
    public void updateUser(@Param("upass") String upass,@Param("uname") String uname);

}
