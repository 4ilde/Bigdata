package com.flight.ticketsAnalysis.entity;

public class LowestPriceEntity {

    private int lp_id;
    private int price;
    private String departure_name;
    private String landing_name;
    private String day;


    public int getLp_id() {
        return lp_id;
    }

    public void setLp_id(int lp_id) {
        this.lp_id = lp_id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }


}
