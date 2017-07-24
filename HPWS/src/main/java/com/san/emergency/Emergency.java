package com.san.emergency;

import com.san.bloodPressure.BloodPressure;
import com.san.user.User;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Emergency {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private User user;
    @ManyToOne
    private BloodPressure blood_pressure;
    private String location_x;
    private String location_y;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp emergency_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp emergency_updated_at;
    public Emergency() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BloodPressure getBlood_pressure() {
        return blood_pressure;
    }

    public void setBlood_pressure(BloodPressure blood_pressure) {
        this.blood_pressure = blood_pressure;
    }

    public String getLocation_x() {
        return location_x;
    }

    public void setLocation_x(String location_x) {
        this.location_x = location_x;
    }

    public String getLocation_y() {
        return location_y;
    }

    public void setLocation_y(String location_y) {
        this.location_y = location_y;
    }

    public Timestamp getEmergency_created_at() {
        return emergency_created_at;
    }

    public void setEmergency_created_at(Timestamp emergency_created_at) {
        this.emergency_created_at = emergency_created_at;
    }

    public Timestamp getEmergency_updated_at() {
        return emergency_updated_at;
    }

    public void setEmergency_updated_at(Timestamp emergency_updated_at) {
        this.emergency_updated_at = emergency_updated_at;
    }
}