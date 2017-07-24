package com.san.rating;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Rating {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer rating;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp rating_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp rating_updated_at;

    public Rating() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Timestamp getRating_created_at() {
        return rating_created_at;
    }

    public void setRating_created_at(Timestamp rating_created_at) {
        this.rating_created_at = rating_created_at;
    }

    public Timestamp getRating_updated_at() {
        return rating_updated_at;
    }

    public void setRating_updated_at(Timestamp rating_updated_at) {
        this.rating_updated_at = rating_updated_at;
    }
}