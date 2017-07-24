package com.san.ratingXUser;

import com.san.rating.Rating;
import com.san.user.User;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rating_x_user")
public class RatingXUser {

    @Id
    private Integer id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Rating rating;
    public RatingXUser() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
}