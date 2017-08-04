package com.san.ratingXUser;

import com.san.rating.Rating;
import com.san.user.User;

import javax.persistence.*;

@Entity
@Table(name = "rating_x_user")
@IdClass(RatingXUserPK.class)
public class RatingXUser {

    @Id
    @ManyToOne
    private User user;
    @Id
    @ManyToOne
    private Rating rating;
    public RatingXUser() {
        
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