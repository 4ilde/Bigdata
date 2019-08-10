package com.flight.ticketsAnalysis.entity;


public class AirlineFlightEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 7009528467475453638L;

    /** afId */
    private Integer af_id;

    /** airlineName */
    private String airline_name;

    /** departureName */
    private String departure_name;

    /** landingName */
    private String landing_name;

    /** marketshare */
    private Double marketshare;

    /** punctualityAve */
    private Double punctuality_ave;

    public Integer getAf_id() {
        return af_id;
    }

    public void setAf_id(Integer af_id) {
        this.af_id = af_id;
    }

    public String getAirline_name() {
        return airline_name;
    }

    public void setAirline_name(String airline_name) {
        this.airline_name = airline_name;
    }

    public String getDeparture_name() {
        return departure_name;
    }

    public void setDeparture_name(String departure_name) {
        this.departure_name = departure_name;
    }

    public String getLanding_name() {
        return landing_name;
    }

    public void setLanding_name(String landing_name) {
        this.landing_name = landing_name;
    }

    public Double getMarketshare() {
        return marketshare;
    }

    public void setMarketshare(Double marketshare) {
        this.marketshare = marketshare;
    }

    public Double getPunctuality_ave() {
        return punctuality_ave;
    }

    public void setPunctuality_ave(Double punctuality_ave) {
        this.punctuality_ave = punctuality_ave;
    }
}