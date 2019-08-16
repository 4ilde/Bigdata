package com.flight.ticketsAnalysis.service;


import com.flight.ticketsAnalysis.entity.AirlineCityEntity;
import com.flight.ticketsAnalysis.entity.AirlineEntity;
import com.flight.ticketsAnalysis.entity.AirlineFlightEntity;

import java.util.List;

public interface AirCompanyService {

    //查询航空公司负责的航线
    public  List<AirlineFlightEntity> queryCompanyAirline(String company_name);

    //查询航空公司在各个航线的业务占比
    public  List<AirlineCityEntity> queryCompanyRateInCity(String company_name);

    //查询所有航空公司准点率和航班数
    public List<AirlineEntity> queryAirCompany();

}
