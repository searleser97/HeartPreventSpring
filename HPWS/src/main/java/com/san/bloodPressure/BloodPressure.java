package com.san.bloodPressure;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class BloodPressure {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String pressure;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp blood_pressure_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp blood_pressure_updated_at;
    public BloodPressure() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public Timestamp getBlood_pressure_created_at() {
        return blood_pressure_created_at;
    }

    public void setBlood_pressure_created_at(Timestamp blood_pressure_created_at) {
        this.blood_pressure_created_at = blood_pressure_created_at;
    }

    public Timestamp getBlood_pressure_updated_at() {
        return blood_pressure_updated_at;
    }

    public void setBlood_pressure_updated_at(Timestamp blood_pressure_updated_at) {
        this.blood_pressure_updated_at = blood_pressure_updated_at;
    }
}