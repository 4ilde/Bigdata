package com.flight.ticketsAnalysis.dao;

import com.flight.ticketsAnalysis.entity.AirlineCityEntity;
import com.flight.ticketsAnalysis.entity.AirlineEntity;
import com.flight.ticketsAnalysis.entity.AirlineFlightEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AirCompanyMapper {

    //查询航空公司负责的航线
    @Select("select * from airline_flight_marketshare where airline_name = #{company_name}")
    public List<AirlineFlightEntity> selectCompanyAirline(String company_name);

    //查询航空公司在各个城市的业务占比
    @Select("select * from airline_city where airline_name = #{company_name}")
    public List<AirlineCityEntity> selectCompanyRateInCity(String company_name);

    //查询所有航空公司准点率和航班数
    @Select("SELECT * from airline_marketshare,airline_punctuality WHERE airline_marketshare.airline_name = airline_punctuality.airline_name;")
    public List<AirlineEntity> selectAircompany();
}
