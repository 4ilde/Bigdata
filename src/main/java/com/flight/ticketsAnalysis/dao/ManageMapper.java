package com.flight.ticketsAnalysis.dao;

import com.flight.ticketsAnalysis.entity.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ManageMapper {

    //显示所有用户
    @Select("select * from user ")
    public List<UserEntity> showUserEntityAccount();

    //根据用户名查找用户
    @Select("select * from user where uesrname = #{username}")
    public List<UserEntity> selectUserEntityAccount(@Param("username") String username);

    //根据用户名修改用户密码
    @Update("update user set password = #{password},email = #{email} where username = #{username}")
    public int changeUserPassword(@Param("username") String username,@Param("password") String password,@Param("email") String email);

    //根据用户名删除用户
    @Delete("delete from user where username = #{username}")
    public int deleteUser(@Param("username") String username);
    //添加
    @Insert("insert into user(username,password,email) values(#{username},#{password},#{email})")
    public int addUser(@Param("username") String username, @Param("password") String password, @Param("email") String email);
}
