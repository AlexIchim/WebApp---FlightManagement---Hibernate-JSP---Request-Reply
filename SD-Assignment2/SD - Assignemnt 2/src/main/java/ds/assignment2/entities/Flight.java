package ds.assignment2.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Alex PC on 15/10/2016.
 */
/**
 * @Author: Alex Ichim - DS 2016
 * @Module: SD-Assignment 2
 * @Since: October 10, 2016
 * @Description:
 *  Class describing the flights.
 */
public class Flight {

    private int flight_number;

    private String airplane_type;

    private City departure_city;
    private City arrival_city;

    private Date departure_date;
    private Date departure_time;
    private Date arrival_date;
    private Date arrival_time;

    public Flight () {
    }

    public Flight(String airplane_type, City departure_city, Date departure_date, Date departure_time, City arrival_city, Date arrival_date, Date arrival_time) {
        this.airplane_type = airplane_type;
        this.departure_city = departure_city;
        this.departure_date = departure_date;
        this.departure_time = departure_time;
        this.arrival_city = arrival_city;
        this.arrival_date = arrival_date;
        this.arrival_time = arrival_time;
    }

    public int getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(int flight_number) {
        this.flight_number = flight_number;
    }

    public String getAirplane_type() {
        return airplane_type;
    }

    public void setAirplane_type(String airplane_type) {
        this.airplane_type = airplane_type;
    }

    public Date getDeparture_date() {
        return departure_date;
    }

    public void setDeparture_date(Date departure_date) {
        this.departure_date = departure_date;
    }

    public Date getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(Date departure_time) {
        this.departure_time = departure_time;
    }

    public Date getArrival_date() {
        return arrival_date;
    }

    public void setArrival_date(Date arrival_date) {
        this.arrival_date = arrival_date;
    }

    public Date getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(Date arrival_time) {
        this.arrival_time = arrival_time;
    }

    public City getDeparture_city() {
        return departure_city;
    }

    public void setDeparture_city(City departure_city) {
        this.departure_city = departure_city;
    }

    public City getArrival_city() {
        return arrival_city;
    }

    public void setArrival_city(City arrival_city) {
        this.arrival_city = arrival_city;
    }
}
