package com.ajit.model;

import javax.persistence.*;

@Entity
@Table
public class Employee {

    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @javax.persistence.Id
    private long Id;

    @Column
    private String firstName;
    @Column
    private String lastNamr;

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

}
