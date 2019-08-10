package com.flight.ticketsAnalysis.entity;


public class FlightRankEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 3553355094235113209L;


    /** frId */
    private Integer fr_id;

    /** departureName */
    private String departure_name;

    /** landingName */
    private String landing_name;

    /** flightNumber */
    private Integer flight_number;

    public Integer getFr_id() {
        return fr_id;
    }

    public void setFr_id(Integer fr_id) {
        this.fr_id = fr_id;
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

    public Integer getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(Integer flight_number) {
        this.flight_number = flight_number;
    }
}