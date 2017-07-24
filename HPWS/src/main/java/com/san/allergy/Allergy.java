package com.san.allergy;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Allergy {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String allergy;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp allergy_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp allergy_updated_at;

    public Allergy() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public Timestamp getAllergy_created_at() {
        return allergy_created_at;
    }

    public void setAllergy_created_at(Timestamp allergy_created_at) {
        this.allergy_created_at = allergy_created_at;
    }

    public Timestamp getAllergy_updated_at() {
        return allergy_updated_at;
    }

    public void setAllergy_updated_at(Timestamp allergy_updated_at) {
        this.allergy_updated_at = allergy_updated_at;
    }
}