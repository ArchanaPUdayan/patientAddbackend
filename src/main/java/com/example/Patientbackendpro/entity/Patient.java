package com.example.Patientbackendpro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Patient")
public class Patient {
    @Id
@GeneratedValue
private int id;
private String name;
private String description;
private String eventdata;


    public Patient() {

    }

    public Patient(int id, String name, String description,String eventdata) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.eventdata = eventdata;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getEventdata() {
        return eventdata;
    }

    public void setEventdata(String eventdata) {
        this.eventdata = eventdata;
    }
}
