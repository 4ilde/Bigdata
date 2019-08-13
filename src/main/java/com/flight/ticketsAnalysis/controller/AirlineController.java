package com.flight.ticketsAnalysis.controller;


import com.flight.ticketsAnalysis.entity.AirlineFlightEntity;
import com.flight.ticketsAnalysis.service.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/AirlineController")
public class AirlineController {

    @Autowired
    private AirlineService airlineService;

    //查询航空公司在各个城市的业务占比
    @RequestMapping("companyRateInAirline")
    @ResponseBody
    public Object queryCompanyRateIAirline(@RequestParam String departure_name, @RequestParam String landing_name){
        List<AirlineFlightEntity> list = airlineService.queryCompanyRateInAirline(departure_name, landing_name);
        return list;
    }
}
