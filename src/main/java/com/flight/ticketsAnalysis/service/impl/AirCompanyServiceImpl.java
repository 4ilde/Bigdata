package com.flight.ticketsAnalysis.service.impl;

import com.flight.ticketsAnalysis.dao.AirCompanyMapper;
import com.flight.ticketsAnalysis.entity.AirlineCityEntity;
import com.flight.ticketsAnalysis.entity.AirlineEntity;
import com.flight.ticketsAnalysis.entity.AirlineFlightEntity;
import com.flight.ticketsAnalysis.service.AirCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirCompanyServiceImpl implements AirCompanyService {

    @Autowired
    private AirCompanyMapper airCompanyMapper;

    //查询航空公司负责的航线
    @Override
    public List<AirlineFlightEntity> queryCompanyAirline(String company_name){
        return airCompanyMapper.selectCompanyAirline(company_name);
    }

    //查询各城市的航空公司市场占比
    @Override
    public List<AirlineCityEntity> queryCompanyRateInCity(String company_name){
        return airCompanyMapper.selectCompanyRateInCity(company_name);
    }

    //查询所有航空公司准点率和航班数
    @Override
    public List<AirlineEntity> queryAirCompany(){
        return airCompanyMapper.selectAircompany();
    }
}
