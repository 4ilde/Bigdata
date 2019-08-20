package com.flight.ticketsAnalysis.controller;

import com.flight.ticketsAnalysis.entity.UserEntity;
import com.flight.ticketsAnalysis.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
@RequestMapping("/ManageController")
public class ManageController {
    @Autowired
    private ManageService manageService;

    @RequestMapping("queryUser")
    @ResponseBody
    public Object queryUser(){
        List<UserEntity> list = manageService.queryUser();
        return list;
    }

    @RequestMapping("changeUser")
    @ResponseBody
    public int changeUser(@RequestParam("username") String username,@RequestParam("password") String password,@RequestParam("email") String email){
        int list = manageService.changeUser(username,password,email);
        return list;
    }
    @RequestMapping("deleteUser")
    @ResponseBody
    public int deleteUser(@RequestParam("username") String username){
        int list = manageService.deleteUser(username);
        return list;
    }
    @RequestMapping("addUser")
    @ResponseBody
    public int addUser(@RequestParam("username") String username,@RequestParam("password") String password,@RequestParam("email") String email){
        int list = manageService.addUser(username,password,email);
        return list;
    }
}
