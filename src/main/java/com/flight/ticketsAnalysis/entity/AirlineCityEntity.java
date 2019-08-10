package com.flight.ticketsAnalysis.entity;


public class AirlineCityEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 2096919544461367644L;


    /** acId */
    private Integer ac_id;

    /** airlineName */
    private String airline_name;

    /** cityName */
    private String city_name;

    /** province */
    private String province;

    /** marketshare */
    private Double marketshare;

    public Integer getAc_id() {
        return ac_id;
    }

    public void setAc_id(Integer ac_id) {
        this.ac_id = ac_id;
    }

    public String getAirline_name() {
        return airline_name;
    }

    public void setAirline_name(String airline_name) {
        this.airline_name = airline_name;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Double getMarketshare() {
        return marketshare;
    }

    public void setMarketshare(Double marketshare) {
        this.marketshare = marketshare;
    }
}