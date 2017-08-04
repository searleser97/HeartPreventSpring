package com.san.identificationCard;

import com.san.user.User;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class IdentificationCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private User user;
    private String identification_card;
    private Integer identification_card_state;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp identification_card_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp identification_card_updated_at;

    public IdentificationCard() {

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

    public String getIdentification_card() {
        return identification_card;
    }

    public void setIdentification_card(String identification_card) {
        this.identification_card = identification_card;
    }

    public Integer getIdentification_card_state() {
        return identification_card_state;
    }

    public void setIdentification_card_state(Integer identification_card_state) {
        this.identification_card_state = identification_card_state;
    }

    public Timestamp getIdentification_card_created_at() {
        return identification_card_created_at;
    }

    public void setIdentification_card_created_at(Timestamp identification_card_created_at) {
        this.identification_card_created_at = identification_card_created_at;
    }

    public Timestamp getIdentification_card_updated_at() {
        return identification_card_updated_at;
    }

    public void setIdentification_card_updated_at(Timestamp identification_card_updated_at) {
        this.identification_card_updated_at = identification_card_updated_at;
    }
}