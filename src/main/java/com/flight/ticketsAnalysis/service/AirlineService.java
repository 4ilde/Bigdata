package com.flight.ticketsAnalysis.service;

import com.flight.ticketsAnalysis.entity.AirlineFlightEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AirlineService {

    public List<AirlineFlightEntity> queryCompanyRateInAirline(@Param("departure_name") String departure_name, @Param("landing_name") String landing_name);

}
