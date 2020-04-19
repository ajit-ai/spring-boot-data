package com.ajit.model;

public class City {

    private String states;
    private String country;
    private int pincode;

    public City(String states, String country, int pincode) {
        this.states = states;
        this.country = country;
        this.pincode = pincode;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
