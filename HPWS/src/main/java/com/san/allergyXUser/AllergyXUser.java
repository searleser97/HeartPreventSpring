package com.san.allergyXUser;

import com.san.allergy.Allergy;
import com.san.user.User;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "allergy_x_user")
public class AllergyXUser {

    @Id
    private Integer id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Allergy allergy;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp allergy_x_user_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp allergy_x_user_updated_at;

    public AllergyXUser() {
        
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

    public Allergy getAllergy() {
        return allergy;
    }

    public void setAllergy(Allergy allergy) {
        this.allergy = allergy;
    }

    public Timestamp getAllergy_x_user_created_at() {
        return allergy_x_user_created_at;
    }

    public void setAllergy_x_user_created_at(Timestamp allergy_x_user_created_at) {
        this.allergy_x_user_created_at = allergy_x_user_created_at;
    }

    public Timestamp getAllergy_x_user_updated_at() {
        return allergy_x_user_updated_at;
    }

    public void setAllergy_x_user_updated_at(Timestamp allergy_x_user_updated_at) {
        this.allergy_x_user_updated_at = allergy_x_user_updated_at;
    }
}