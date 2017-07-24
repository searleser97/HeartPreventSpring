package com.san.accountState;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class AccountState {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String account_state;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp account_state_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp account_state_updated_at;
    public AccountState() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount_state() {
        return account_state;
    }

    public void setAccount_state(String account_state) {
        this.account_state = account_state;
    }

    public Timestamp getAccount_state_created_at() {
        return account_state_created_at;
    }

    public void setAccount_state_created_at(Timestamp account_state_created_at) {
        this.account_state_created_at = account_state_created_at;
    }

    public Timestamp getAccount_state_updated_at() {
        return account_state_updated_at;
    }

    public void setAccount_state_updated_at(Timestamp account_state_updated_at) {
        this.account_state_updated_at = account_state_updated_at;
    }
}