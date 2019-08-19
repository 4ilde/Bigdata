package com.flight.ticketsAnalysis.controller;

import com.flight.ticketsAnalysis.entity.UserEntity;
import com.flight.ticketsAnalysis.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class ManageController {
    @Autowired
    private ManageService manageService;

    @RequestMapping("queryUser")
    @ResponseBody
    public Object queryUser(){
        List<UserEntity> list = manageService.queryUser();
        return list;
    }
}
