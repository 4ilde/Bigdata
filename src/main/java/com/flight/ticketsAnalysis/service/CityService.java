package com.flight.ticketsAnalysis.service;

import com.flight.ticketsAnalysis.entity.*;

import java.util.List;

public interface CityService {

    public List<CityRankEntity> queryCityRank();

    public List<AirlineCityEntity> queryCityBusiness(String city_name);

    public List<FlightRankEntity> queryFlightRank();

    public List<ThroughputDayEntity> queryCityDayThroughput(String city_name);

    public List<ThroughputAveEntity> queryCityAverageThroughput();
}
