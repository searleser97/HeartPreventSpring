package com.san.ratingXUser;

import com.san.rating.Rating;
import com.san.user.User;

import java.io.Serializable;

public class RatingXUserPK implements Serializable {
    private User user;
    private Rating rating;
}
