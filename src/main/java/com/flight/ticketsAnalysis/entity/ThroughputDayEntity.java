package com.flight.ticketsAnalysis.entity;


public class ThroughputDayEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 4068928791234599393L;

    /* This code was generated  TableGo tools, mark 1 begin. */

    /** throughputDayId */
    private Integer throughput_day_id;

    /** cityName */
    private String city_name;

    /** province */
    private String province;

    /** day */
    private String day;

    /** throughputDay */
    private Double throughput_day;

    public Integer getThroughput_day_id() {
        return throughput_day_id;
    }

    public void setThroughput_day_id(Integer throughput_day_id) {
        this.throughput_day_id = throughput_day_id;
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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Double getThroughput_day() {
        return throughput_day;
    }

    public void setThroughput_day(Double throughput_day) {
        this.throughput_day = throughput_day;
    }
}