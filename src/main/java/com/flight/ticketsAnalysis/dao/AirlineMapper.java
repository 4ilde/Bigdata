package com.flight.ticketsAnalysis.dao;


import com.flight.ticketsAnalysis.entity.AirlineFlightEntity;
import com.flight.ticketsAnalysis.entity.LowestPriceEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AirlineMapper {

    //查询航空公司在各个城市的业务占比
    @Select("select * from airline_flight where departure_name = #{departure_name} and landing_name = #{landing_name}")
    public List<AirlineFlightEntity> selectCompanyRateInAirline(@Param("departure_name") String departure_name, @Param("landing_name") String landing_name);


    //查询航空公司在各个航线的准点率
    @Select("select * from airline_flight where departure_name = #{departure_name} and landing_name = #{landing_name}")
    public List<AirlineFlightEntity> selectCompanyPunctualityInAirline(@Param("departure_name") String departure_name, @Param("landing_name") String landing_name);

    //查询各个航线的最低票价
    @Select("select * from l_price where departure_name = #{departure_name} and landing_name = #{landing_name} order by `day`")
    public List<LowestPriceEntity> selectTicketPriceInAirline(@Param("departure_name") String departure_name, @Param("landing_name") String landing_name);


}
