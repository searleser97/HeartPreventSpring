package com.san.bracelet;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Bracelet {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String code;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp bracelet_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp bracelet_updated_at;

    public Bracelet() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Timestamp getBracelet_created_at() {
        return bracelet_created_at;
    }

    public void setBracelet_created_at(Timestamp bracelet_created_at) {
        this.bracelet_created_at = bracelet_created_at;
    }

    public Timestamp getBracelet_updated_at() {
        return bracelet_updated_at;
    }

    public void setBracelet_updated_at(Timestamp bracelet_updated_at) {
        this.bracelet_updated_at = bracelet_updated_at;
    }
}