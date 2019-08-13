package com.flight.ticketsAnalysis.service.impl;

import com.flight.ticketsAnalysis.dao.AirlineMapper;
import com.flight.ticketsAnalysis.entity.AirlineFlightEntity;
import com.flight.ticketsAnalysis.service.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirlineServiceImpl implements AirlineService {

    @Autowired
    private AirlineMapper airlineMapper;

    //查询各航线的航空公司市场占比
    @Override
    public List<AirlineFlightEntity> queryCompanyRateInAirline(String departure_name, String landing_name){
        return airlineMapper.selectCompanyRateInAirline(departure_name, landing_name);
    }


}
