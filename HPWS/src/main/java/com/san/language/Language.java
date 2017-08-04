package com.san.language;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String language;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp language_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp language_updated_at;

    public Language() {

    }

    public Language(Integer id, String language, Timestamp language_created_at, Timestamp language_updated_at) {
        this.id = id;
        this.language = language;
        this.language_created_at = language_created_at;
        this.language_updated_at = language_updated_at;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Timestamp getLanguage_created_at() {
        return language_created_at;
    }

    public void setLanguage_created_at(Timestamp language_created_at) {
        this.language_created_at = language_created_at;
    }

    public Timestamp getLanguage_updated_at() {
        return language_updated_at;
    }

    public void setLanguage_updated_at(Timestamp language_updated_at) {
        this.language_updated_at = language_updated_at;
    }
}