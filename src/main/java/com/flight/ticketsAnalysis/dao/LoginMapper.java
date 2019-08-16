package com.flight.ticketsAnalysis.dao;


import com.flight.ticketsAnalysis.entity.AdminEntity;
import com.flight.ticketsAnalysis.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LoginMapper {

    //登录模块
    @Select("select * from admin where adminname = #{username} and password = #{password}")
    public List<AdminEntity> selectAdminAccount(@Param("username") String username, @Param("password") String password);

    @Select("select * from user where username = #{username} and password = #{password}")
    public List<UserEntity> selectUserAccount(@Param("username") String username, @Param("password") String password);
}
