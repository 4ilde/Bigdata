package com.flight.ticketsAnalysis.controller;


import com.flight.ticketsAnalysis.entity.*;
import com.flight.ticketsAnalysis.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/CityController")
public class CityController {

    @Autowired
    private CityService cityService;

    //主页城市平均吞吐量显示
    @RequestMapping("indexCityThroughput")
    @ResponseBody
    public Object queryCityAverageThroughput(){
        List<ThroughputAveEntity> list = cityService.queryCityAverageThroughput();
        return list;
    }

    //城市的日吞吐量
    @RequestMapping("cityDailyThroughput")
    @ResponseBody
    public Object queryCityThroughput(@RequestParam(value="city_name") String city_name){
        List<ThroughputDayEntity> list = cityService.queryCityDayThroughput(city_name);
        return list;
    }

    //热门城市排行
    @RequestMapping("cityRank")
    @ResponseBody
    public Object queryCityRank(){
        List<CityRankEntity> list = cityService.queryCityRank();
        return list;
    }

    //城市的业务占比
    @RequestMapping("cityBusiness")
    @ResponseBody
    public Object queryCityBusiness(@RequestParam(value="city_name") String city_name){
        List<AirlineCityEntity> list = cityService.queryCityBusiness(city_name);
        return list;
    }

    //热门航线排行
    @RequestMapping("flightRank")
    @ResponseBody
    public Object queryFlightRank(){
        List<FlightRankEntity> list = cityService.queryFlightRank();
        return list;
    }



}
