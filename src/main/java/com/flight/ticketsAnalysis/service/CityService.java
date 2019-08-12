package com.flight.ticketsAnalysis.service;

import com.flight.ticketsAnalysis.entity.AirlineCityEntity;
import com.flight.ticketsAnalysis.entity.CityRankEntity;
import com.flight.ticketsAnalysis.entity.FlightRankEntity;
import com.flight.ticketsAnalysis.entity.ThroughputDayEntity;

import java.util.List;

public interface CityService {

    public List<CityRankEntity> queryCityRank();

    public List<AirlineCityEntity> queryCityBusiness(String city_name);

    public List<FlightRankEntity> queryFlightRank();

    public List<ThroughputDayEntity> queryCityDayThroughput(String city_name);
}
