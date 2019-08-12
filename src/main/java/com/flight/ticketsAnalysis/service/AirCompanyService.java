package com.flight.ticketsAnalysis.service;


import com.flight.ticketsAnalysis.entity.AirlineCityEntity;
import com.flight.ticketsAnalysis.entity.AirlineEntity;

import java.util.List;

public interface AirCompanyService {

    public  List<AirlineCityEntity> queryCompanyRateInCity(String company_name);

    public List<AirlineEntity> queryAirCompany();

}
