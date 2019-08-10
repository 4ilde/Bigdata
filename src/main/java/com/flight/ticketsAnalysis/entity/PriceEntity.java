package com.flight.ticketsAnalysis.entity;


public class PriceEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 6879651089839416900L;

    /** priceId */
    private Integer price_id;

    /** departureName */
    private String departure_name;

    /** landingName */
    private String landing_name;

    /** departureTime */
    private String departure_time;

    /** landingTime */
    private String landing_time;

    /** price */
    private Double price;

    public Integer getPrice_id() {
        return price_id;
    }

    public void setPrice_id(Integer price_id) {
        this.price_id = price_id;
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

    public String getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public String getLanding_time() {
        return landing_time;
    }

    public void setLanding_time(String landing_time) {
        this.landing_time = landing_time;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}