package com.flight.ticketsAnalysis.entity;


public class AirlineEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 5147744509126355501L;

    /** airlineId */
    private Integer airline_id;

    /** airlineName */
    private String airline_name;

    /** flightNumber */
    private Integer flight_number;

    /** punctualityAve */
    private Double punctuality_ave;

    /** marketshare */
    private Double marketshare;

    public Integer getAirline_id() {
        return airline_id;
    }

    public void setAirline_id(Integer airline_id) {
        this.airline_id = airline_id;
    }

    public String getAirline_name() {
        return airline_name;
    }

    public void setAirline_name(String airline_name) {
        this.airline_name = airline_name;
    }

    public Integer getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(Integer flight_number) {
        this.flight_number = flight_number;
    }

    public Double getPunctuality_ave() {
        return punctuality_ave;
    }

    public void setPunctuality_ave(Double punctuality_ave) {
        this.punctuality_ave = punctuality_ave;
    }

    public Double getMarketshare() {
        return marketshare;
    }

    public void setMarketshare(Double marketshare) {
        this.marketshare = marketshare;
    }
}