package com.flight.ticketsAnalysis.dao;


import com.flight.ticketsAnalysis.entity.AirlineCityEntity;
import com.flight.ticketsAnalysis.entity.CityRankEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CityMapper {

    @Select("select cr_id,city_name,province,flight_number from city_rank")
    public List<CityRankEntity> selectCityRank();

    @Select("select ac_id,airline_name,city_name,marketshare from airline_city")
    public List<AirlineCityEntity> selectCityBusiness();
}
