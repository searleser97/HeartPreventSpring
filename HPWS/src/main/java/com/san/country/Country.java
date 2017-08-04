package com.san.country;

import com.san.language.Language;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String country;
    private String code;
    @ManyToOne
    private Language language;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp country_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp country_updated_at;

    public Country() {

    }

    public Country(Integer id, String country, Language language, Timestamp country_created_at, Timestamp country_updated_at) {
        this.id = id;
        this.country = country;
        this.language = language;
        this.country_created_at = country_created_at;
        this.country_updated_at = country_updated_at;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Timestamp getCountry_created_at() {
        return country_created_at;
    }

    public void setCountry_created_at(Timestamp country_created_at) {
        this.country_created_at = country_created_at;
    }

    public Timestamp getCountry_updated_at() {
        return country_updated_at;
    }

    public void setCountry_updated_at(Timestamp country_updated_at) {
        this.country_updated_at = country_updated_at;
    }
}