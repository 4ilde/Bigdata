package com.flight.ticketsAnalysis.entity;


public class ThroughputAveEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -6630920472031707279L;


    /** throughputAveId */
    private Integer throughput_ave_id;

    /** cityName */
    private String city_name;

    /** province */
    private String province;

    /** throughputAve */
    private Double throughput_ave;

    public Integer getThroughput_ave_id() {
        return throughput_ave_id;
    }

    public void setThroughput_ave_id(Integer throughput_ave_id) {
        this.throughput_ave_id = throughput_ave_id;
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

    public Double getThroughput_ave() {
        return throughput_ave;
    }

    public void setThroughput_ave(Double throughput_ave) {
        this.throughput_ave = throughput_ave;
    }
}