package com.flight.ticketsAnalysis.service.impl;


import com.flight.ticketsAnalysis.dao.LoginMapper;
import com.flight.ticketsAnalysis.entity.AdminEntity;
import com.flight.ticketsAnalysis.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private LoginMapper loginMapper;

}
