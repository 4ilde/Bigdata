package com.flight.ticketsAnalysis.dao;

import com.flight.ticketsAnalysis.entity.AirlineCityEntity;
import com.flight.ticketsAnalysis.entity.AirlineEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AirCompanyMapper {

    //查询航空公司在各个城市的业务占比
    @Select("select * from airline_city where airline_name = #{company_name}")
    public List<AirlineCityEntity> selectCompanyRateInCity(String company_name);

    @Select("select * from airline")
    public List<AirlineEntity> selectAircompany();
}
