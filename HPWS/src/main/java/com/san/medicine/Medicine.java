package com.san.medicine;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Medicine {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String medicine;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp medicine_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp medicine_updated_at;
    public Medicine() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public Timestamp getMedicine_created_at() {
        return medicine_created_at;
    }

    public void setMedicine_created_at(Timestamp medicine_created_at) {
        this.medicine_created_at = medicine_created_at;
    }

    public Timestamp getMedicine_updated_at() {
        return medicine_updated_at;
    }

    public void setMedicine_updated_at(Timestamp medicine_updated_at) {
        this.medicine_updated_at = medicine_updated_at;
    }
}