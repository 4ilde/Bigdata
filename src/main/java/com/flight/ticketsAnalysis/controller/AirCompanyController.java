package com.flight.ticketsAnalysis.controller;


import com.flight.ticketsAnalysis.entity.AirlineCityEntity;
import com.flight.ticketsAnalysis.entity.AirlineEntity;
import com.flight.ticketsAnalysis.service.AirCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/AirCompanyController")
public class AirCompanyController {

    @Autowired
    private AirCompanyService airCompanyService;


    //查询航空公司在各个城市的业务占比
    @RequestMapping("companyRateInCity")
    @ResponseBody
    public Object queryCompanyRateInCity(String company_name){
        List<AirlineCityEntity> list = airCompanyService.queryCompanyRateInCity(company_name);
        return list;
    }


    @RequestMapping("airFlightAndPunctuality")
    @ResponseBody
    public Object queryCityRank(){
        List<AirlineEntity> list = airCompanyService.queryAirCompany();
        return list;
    }

}
