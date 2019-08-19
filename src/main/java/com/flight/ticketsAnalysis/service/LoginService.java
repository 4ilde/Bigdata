package com.flight.ticketsAnalysis.service;

import com.flight.ticketsAnalysis.entity.AdminEntity;
import com.flight.ticketsAnalysis.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LoginService {

    //登陆模块
    public AdminEntity queryAdminAccount(@Param("username") String username, @Param("password") String password);

    public UserEntity queryUserAccount(@Param("username") String username, @Param("password") String password);

    //注册模块
    public boolean InsertUserAccount(@Param("email") String email, @Param("username") String username, @Param("password") String password);

    public List<UserEntity> queryUser(String username);
}
