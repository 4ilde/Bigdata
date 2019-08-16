package com.flight.ticketsAnalysis.controller;


import com.flight.ticketsAnalysis.entity.AdminEntity;
import com.flight.ticketsAnalysis.entity.UserEntity;
import com.flight.ticketsAnalysis.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/LoginController")
public class LoginController {

    @Autowired
    private LoginService loginService;

    //查询航空公司负责的航线
    @RequestMapping("Login")
    @ResponseBody
    public int loginCheck(@RequestParam String username, @RequestParam String password, HttpSession session) {
        List<AdminEntity> admin = loginService.queryAdminAccount(username, password);

        List<UserEntity> user = loginService.queryUserAccount(username, password);
        int flag = -1;
        if (!admin.isEmpty()) {
            flag = 1;
        } else if (!user.isEmpty()) {
            flag = 0;
        }
        return flag;
    }
}
