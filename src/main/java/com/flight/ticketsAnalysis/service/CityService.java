package com.flight.ticketsAnalysis.service;

import com.flight.ticketsAnalysis.entity.AirlineCityEntity;
import com.flight.ticketsAnalysis.entity.CityRankEntity;

import java.util.List;

public interface CityService {

    public List<CityRankEntity> queryCityRank();

    public List<AirlineCityEntity> queryCityBusiness();
}
