package com.flight.ticketsAnalysis.service.impl;

import com.flight.ticketsAnalysis.dao.CityMapper;
import com.flight.ticketsAnalysis.entity.AirlineCityEntity;
import com.flight.ticketsAnalysis.entity.CityRankEntity;
import com.flight.ticketsAnalysis.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public List<CityRankEntity> queryCityRank() {
        return cityMapper.selectCityRank();
    }

    @Override
    public List<AirlineCityEntity> queryCityBusiness(){
        return cityMapper.selectCityBusiness();
    }

}
