package com.ajit.model;


public class Employee {
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNamr() {
        return lastNamr;
    }

    public void setLastNamr(String lastNamr) {
        this.lastNamr = lastNamr;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    private String firstName;
    private String lastNamr;
    private long Id;
}
