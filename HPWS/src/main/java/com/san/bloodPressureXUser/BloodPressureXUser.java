package com.san.bloodPressureXUser;

import com.san.bloodPressure.BloodPressure;
import com.san.user.User;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "blood_pressure_x_user")
@IdClass(BloodPressureXUserPK.class)
public class BloodPressureXUser {

    @Id
    @ManyToOne
    private User user;
    @Id
    @ManyToOne
    private BloodPressure bloodPressure;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp blood_pressure_x_user_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp blood_pressure_x_user_updated_at;

    public BloodPressureXUser() {

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BloodPressure getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(BloodPressure bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public Timestamp getBlood_pressure_x_user_created_at() {
        return blood_pressure_x_user_created_at;
    }

    public void setBlood_pressure_x_user_created_at(Timestamp blood_pressure_x_user_created_at) {
        this.blood_pressure_x_user_created_at = blood_pressure_x_user_created_at;
    }

    public Timestamp getBlood_pressure_x_user_updated_at() {
        return blood_pressure_x_user_updated_at;
    }

    public void setBlood_pressure_x_user_updated_at(Timestamp blood_pressure_x_user_updated_at) {
        this.blood_pressure_x_user_updated_at = blood_pressure_x_user_updated_at;
    }
}