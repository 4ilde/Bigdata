package com.flight.ticketsAnalysis.service.impl;


import com.flight.ticketsAnalysis.dao.LoginMapper;
import com.flight.ticketsAnalysis.entity.AdminEntity;
import com.flight.ticketsAnalysis.entity.UserEntity;
import com.flight.ticketsAnalysis.service.LoginService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public List<AdminEntity> queryAdminAccount(String username, String password) {
        return loginMapper.selectAdminAccount(username, password);
    }

    @Override
    public List<UserEntity> queryUserAccount(String username, String password) {
        return loginMapper.selectUserAccount(username, password);
    }



}
