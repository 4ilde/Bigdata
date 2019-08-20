package com.flight.ticketsAnalysis.service.impl;

import com.flight.ticketsAnalysis.dao.ManageMapper;
import com.flight.ticketsAnalysis.entity.UserEntity;
import com.flight.ticketsAnalysis.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManageServiceImpl implements ManageService {

    @Autowired
    private ManageMapper manageMapper;

    @Override
    public List<UserEntity> queryUser(){
        return manageMapper.showUserEntityAccount();
    }
    @Override
    public int deleteUser(String username){
        return manageMapper.deleteUser(username);
    }

    public int changeUser(String username,String password,String email){
        return manageMapper.changeUserPassword(username,password,email);
    }
    @Override
    public int addUser(String username, String password, String email){
       return manageMapper.addUser(username,password,email);
    }
}
