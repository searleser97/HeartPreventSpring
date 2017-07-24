package com.san.disease;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Disease {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String disease;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp disease_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp disease_updated_at;
    public Disease() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public Timestamp getDisease_created_at() {
        return disease_created_at;
    }

    public void setDisease_created_at(Timestamp disease_created_at) {
        this.disease_created_at = disease_created_at;
    }

    public Timestamp getDisease_updated_at() {
        return disease_updated_at;
    }

    public void setDisease_updated_at(Timestamp disease_updated_at) {
        this.disease_updated_at = disease_updated_at;
    }
}