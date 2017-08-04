package com.san.category;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String category;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp category_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp category_updated_at;

    public Category() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Timestamp getCategory_created_at() {
        return category_created_at;
    }

    public void setCategory_created_at(Timestamp category_created_at) {
        this.category_created_at = category_created_at;
    }

    public Timestamp getCategory_updated_at() {
        return category_updated_at;
    }

    public void setCategory_updated_at(Timestamp category_updated_at) {
        this.category_updated_at = category_updated_at;
    }
}