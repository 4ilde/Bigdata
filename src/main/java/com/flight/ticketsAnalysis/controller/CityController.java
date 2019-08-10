package com.flight.ticketsAnalysis.controller;


import com.flight.ticketsAnalysis.entity.AirlineCityEntity;
import com.flight.ticketsAnalysis.entity.CityRankEntity;
import com.flight.ticketsAnalysis.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/CityController")
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping("cityRank")
    @ResponseBody
    public Object queryCityRank(){
        List<CityRankEntity> list = cityService.queryCityRank();
        return list;
    }

    @RequestMapping("cityBusiness")
    @ResponseBody
    public Object queryCityBusiness(){
        List<AirlineCityEntity> list = cityService.queryCityBusiness();
        return list;
    }

}
