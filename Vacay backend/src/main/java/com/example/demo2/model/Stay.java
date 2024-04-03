package com.example.demo2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Stay {
    @Id
    private int hotelId;
    private String destination;
    private int no_of_person;
    private int no_of_day;

    
    public Stay(int hotelId, String destination, int no_of_person, int no_of_day) {
        this.hotelId = hotelId;
        this.destination = destination;
        this.no_of_person = no_of_person;
        this.no_of_day = no_of_day;
    }


    public int getHotelId() {
        return hotelId;
    }


    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }


    public String getDestination() {
        return destination;
    }


    public void setDestination(String destination) {
        this.destination = destination;
    }


    public int getNo_of_person() {
        return no_of_person;
    }


    public void setNo_of_person(int no_of_person) {
        this.no_of_person = no_of_person;
    }


    public int getNo_of_day() {
        return no_of_day;
    }


    public void setNo_of_day(int no_of_day) {
        this.no_of_day = no_of_day;
    }


    public Stay() {
    }
    
    
    
}
