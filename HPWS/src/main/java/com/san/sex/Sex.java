package com.san.sex;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Sex {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String sex;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp sex_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp sex_updated_at;

    public Sex() {

    }

    public Sex(Integer id, String sex, Timestamp sex_created_at, Timestamp sex_updated_at) {
        this.id = id;
        this.sex = sex;
        this.sex_created_at = sex_created_at;
        this.sex_updated_at = sex_updated_at;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Timestamp getSex_created_at() {
        return sex_created_at;
    }

    public void setSex_created_at(Timestamp sex_created_at) {
        this.sex_created_at = sex_created_at;
    }

    public Timestamp getSex_updated_at() {
        return sex_updated_at;
    }

    public void setSex_updated_at(Timestamp sex_updated_at) {
        this.sex_updated_at = sex_updated_at;
    }
}