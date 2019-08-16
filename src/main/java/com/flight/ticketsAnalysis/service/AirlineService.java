package com.flight.ticketsAnalysis.service;

import com.flight.ticketsAnalysis.entity.AirlineFlightEntity;
import com.flight.ticketsAnalysis.entity.LowestPriceEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AirlineService {

    //查询航空公司在各个航线的业务占比
    public List<AirlineFlightEntity> queryCompanyRateInAirline(@Param("departure_name") String departure_name, @Param("landing_name") String landing_name);


    //查询航空公司在各个航线的准点率
    public List<AirlineFlightEntity> queryCompanyPunctualityInAirline(@Param("departure_name") String departure_name, @Param("landing_name") String landing_name);

    //查询各个航线的最低票价
    public List<LowestPriceEntity> queryTicketPriceInAirline(@Param("departure_name") String departure_name, @Param("landing_name") String landing_name);

}
