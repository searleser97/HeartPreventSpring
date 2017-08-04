package com.san.braceletXUser;

import com.san.bracelet.Bracelet;
import com.san.user.User;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "bracelet_x_user")
@IdClass(BraceletXUserPK.class)
public class BraceletXUser {

    @Id
    @ManyToOne
    private User user;
    @Id
    @ManyToOne
    private Bracelet bracelet;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp bracelet_x_user_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp bracelet_x_user_cupdated_at;

    public BraceletXUser() {

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Bracelet getBracelet() {
        return bracelet;
    }

    public void setBracelet(Bracelet bracelet) {
        this.bracelet = bracelet;
    }

    public Timestamp getBracelet_x_user_created_at() {
        return bracelet_x_user_created_at;
    }

    public void setBracelet_x_user_created_at(Timestamp bracelet_x_user_created_at) {
        this.bracelet_x_user_created_at = bracelet_x_user_created_at;
    }

    public Timestamp getBracelet_x_user_cupdated_at() {
        return bracelet_x_user_cupdated_at;
    }

    public void setBracelet_x_user_cupdated_at(Timestamp bracelet_x_user_cupdated_at) {
        this.bracelet_x_user_cupdated_at = bracelet_x_user_cupdated_at;
    }
}