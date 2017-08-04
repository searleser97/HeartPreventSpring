package com.san.textTranslated;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class TextTranslated {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String text_translated;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp text_translated_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp text_translated_updated_at;

    public TextTranslated() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText_translated() {
        return text_translated;
    }

    public void setText_translated(String text_translated) {
        this.text_translated = text_translated;
    }

    public Timestamp getText_translated_created_at() {
        return text_translated_created_at;
    }

    public void setText_translated_created_at(Timestamp text_translated_created_at) {
        this.text_translated_created_at = text_translated_created_at;
    }

    public Timestamp getText_translated_updated_at() {
        return text_translated_updated_at;
    }

    public void setText_translated_updated_at(Timestamp text_translated_updated_at) {
        this.text_translated_updated_at = text_translated_updated_at;
    }
}