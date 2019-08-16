package com.flight.ticketsAnalysis.controller;


import com.flight.ticketsAnalysis.entity.AirlineCityEntity;
import com.flight.ticketsAnalysis.entity.AirlineEntity;
import com.flight.ticketsAnalysis.entity.AirlineFlightEntity;
import com.flight.ticketsAnalysis.service.AirCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/AirCompanyController")
public class AirCompanyController {

    @Autowired
    private AirCompanyService airCompanyService;


    //查询航空公司负责的航线
    @RequestMapping("companyAirline")
    @ResponseBody
    public Object queryCompanyAirline(@RequestParam(value="company_name")String company_name){
        List<AirlineFlightEntity> list = airCompanyService.queryCompanyAirline(company_name);
        return list;
    }

    //查询航空公司在各个城市的业务占比
    @RequestMapping("companyRateInCity")
    @ResponseBody
    public Object queryCompanyRateInCity(@RequestParam(value="company_name")String company_name){
        List<AirlineCityEntity> list = airCompanyService.queryCompanyRateInCity(company_name);
        return list;
    }

    //查询所有航空公司准点率和航班数
    @RequestMapping("airFlightAndPunctuality")
    @ResponseBody
    public Object queryAirCompany(){
        List<AirlineEntity> list = airCompanyService.queryAirCompany();
        return list;
    }

}
