package com.san.section;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Section {

    @Id
    private String id;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp section_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp section_updated_at;

    public Section() {

    }

    public Section(String id, Timestamp section_created_at, Timestamp section_updated_at) {
        this.id = id;
        this.section_created_at = section_created_at;
        this.section_updated_at = section_updated_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Timestamp getSection_created_at() {
        return section_created_at;
    }

    public void setSection_created_at(Timestamp section_created_at) {
        this.section_created_at = section_created_at;
    }

    public Timestamp getSection_updated_at() {
        return section_updated_at;
    }

    public void setSection_updated_at(Timestamp section_updated_at) {
        this.section_updated_at = section_updated_at;
    }
}