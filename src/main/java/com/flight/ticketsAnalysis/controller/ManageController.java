package com.flight.ticketsAnalysis.controller;


import com.flight.ticketsAnalysis.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ManageController")
public class ManageController {

    @Autowired
    private ManageService manageService;
}
