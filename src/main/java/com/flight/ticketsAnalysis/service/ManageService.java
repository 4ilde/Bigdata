package com.flight.ticketsAnalysis.service;

import com.flight.ticketsAnalysis.entity.UserEntity;

import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface ManageService {

    public List<UserEntity> queryUser();

    public int changeUser(@Param("username") String username,@Param("password") String password,@Param("email") String email);

    public int deleteUser(@Param("username") String username);

    public int addUser(@Param("username") String username, @Param("password") String password, @Param("email") String email);
}
