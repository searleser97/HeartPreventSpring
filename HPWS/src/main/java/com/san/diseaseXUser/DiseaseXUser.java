package com.san.diseaseXUser;

import com.san.disease.Disease;
import com.san.user.User;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "disease_x_user")
public class DiseaseXUser {

    @Id
    private Integer id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Disease disease;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp disease_x_user_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp disease_x_user_cupdated_at;
    public DiseaseXUser() {
        
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

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public Timestamp getDisease_x_user_created_at() {
        return disease_x_user_created_at;
    }

    public void setDisease_x_user_created_at(Timestamp disease_x_user_created_at) {
        this.disease_x_user_created_at = disease_x_user_created_at;
    }

    public Timestamp getDisease_x_user_cupdated_at() {
        return disease_x_user_cupdated_at;
    }

    public void setDisease_x_user_cupdated_at(Timestamp disease_x_user_cupdated_at) {
        this.disease_x_user_cupdated_at = disease_x_user_cupdated_at;
    }
}