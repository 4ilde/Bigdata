package com.flight.ticketsAnalysis.dao;


import com.flight.ticketsAnalysis.entity.AdminEntity;
import com.flight.ticketsAnalysis.entity.UserEntity;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LoginMapper {

    //登录模块
    @Select("select * from admin where adminname = #{username} and password = #{password}")
    public AdminEntity selectAdminAccount(@Param("username") String username, @Param("password") String password);

    @Select("select * from user where username = #{username} and password = #{password}")
    public UserEntity selectUserAccount(@Param("username") String username, @Param("password") String password);

    //注册模块
    @Insert("INSERT INTO user ( email, username, password) VALUES (#{email},#{username},#{password})")
    public boolean insertUser(@Param("email") String email, @Param("username") String username, @Param("password") String password);

    @Select("select * from user where username = #{username}")
    public List<UserEntity> selectUser(@Param("username") String username);
}
