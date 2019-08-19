package com.flight.ticketsAnalysis.controller;


import com.flight.ticketsAnalysis.entity.AdminEntity;
import com.flight.ticketsAnalysis.entity.UserEntity;
import com.flight.ticketsAnalysis.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/LoginController")

public class LoginController {

    @Autowired
    private LoginService loginService;

    //登录模块
    @RequestMapping("/Login")
    @ResponseBody
    public int loginCheck(@RequestParam(value="username") String username, @RequestParam(value="password") String password, HttpServletRequest request) {
        AdminEntity admin = loginService.queryAdminAccount(username, password);

        UserEntity user = loginService.queryUserAccount(username, password);
        int flag = -1;
        HttpSession session = request.getSession();
        if (admin != null) {
            session.setAttribute("userName", admin.getAdminname());
            session.setAttribute("statue", "admin");
            flag = 1;
        } else if (user != null) {
            session.setAttribute("userName", user.getUsername());
            session.setAttribute("statue", "user");
            flag = 0;
        }
        return flag;
    }

    @RequestMapping("/getSession")
    @ResponseBody
    public List<String> getSession(HttpServletRequest request){
        List<String> list = new ArrayList<>();
        String str1 = (String) request.getSession().getAttribute("userName");
        String str2 = (String) request.getSession().getAttribute("statue");
        list.add(str1);
        list.add(str2);
        return list;
    }

    @RequestMapping("/deleteSession")
    @ResponseBody
    public boolean deleteSession(HttpServletRequest request){
        request.getSession().invalidate();
        return true;
    }

    //注册模块
    @RequestMapping("Register")
    @ResponseBody
    public int registerCheck(@RequestParam(value="username") String username, @RequestParam(value="password") String password, @RequestParam(value="email") String email) {
        int flag;
        List<UserEntity> user = loginService.queryUser(username);
        if (!user.isEmpty()){
            flag = -1;
        }else if (loginService.InsertUserAccount(email, username, password) == true){
            flag = 1;
        }else {
            flag = 0;
        }
        return flag;
    }

}
