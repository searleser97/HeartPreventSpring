package com.san.medicineXUser;

import com.san.medicine.Medicine;
import com.san.user.User;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "medicine_x_user")
@IdClass(MedicineXUserPK.class)
public class MedicineXUser {

    @Id
    @ManyToOne
    private User user;
    @Id
    @ManyToOne
    private Medicine medicine;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp medicine_x_user_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp medicine_x_user_cupdated_at;
    public MedicineXUser() {
        
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public Timestamp getMedicine_x_user_created_at() {
        return medicine_x_user_created_at;
    }

    public void setMedicine_x_user_created_at(Timestamp medicine_x_user_created_at) {
        this.medicine_x_user_created_at = medicine_x_user_created_at;
    }

    public Timestamp getMedicine_x_user_cupdated_at() {
        return medicine_x_user_cupdated_at;
    }

    public void setMedicine_x_user_cupdated_at(Timestamp medicine_x_user_cupdated_at) {
        this.medicine_x_user_cupdated_at = medicine_x_user_cupdated_at;
    }
}