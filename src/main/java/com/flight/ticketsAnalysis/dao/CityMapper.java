package com.flight.ticketsAnalysis.dao;


import com.flight.ticketsAnalysis.entity.AirlineCityEntity;
import com.flight.ticketsAnalysis.entity.CityRankEntity;
import com.flight.ticketsAnalysis.entity.FlightRankEntity;
import com.flight.ticketsAnalysis.entity.ThroughputDayEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CityMapper {

    //查询城市的热门排行
    @Select("select cr_id,city_name,flight_number from city_rank")
    public List<CityRankEntity> selectCityRank();

    //查询城市的市场占比
    @Select("select airline_name,city_name,marketshare from airline_city where city_name = #{city_name}")
    public List<AirlineCityEntity> selectCityBusiness(String city_name);

    //查询热门航线排行
    @Select("select * from flight_rank")
    public List<FlightRankEntity> selectFlightRank();

    //查询城市的吞吐量
    @Select("select city_name,day,throughput_day from throughput_day where city_name= #{city_name}")
    public List<ThroughputDayEntity> selectCityThroughput(String city_name);
}
