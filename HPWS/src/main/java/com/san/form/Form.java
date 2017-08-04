package com.san.form;

import com.san.Role.Role;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Form {

    @Id
    private String id;
    @ManyToOne
    private Role role;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp form_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp form_updated_at;

    public Form() {
    }

    public Form(String id, Role role, Timestamp form_created_at, Timestamp form_updated_at) {
        this.id = id;
        this.role = role;
        this.form_created_at = form_created_at;
        this.form_updated_at = form_updated_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Timestamp getForm_created_at() {
        return form_created_at;
    }

    public void setForm_created_at(Timestamp form_created_at) {
        this.form_created_at = form_created_at;
    }

    public Timestamp getForm_updated_at() {
        return form_updated_at;
    }

    public void setForm_updated_at(Timestamp form_updated_at) {
        this.form_updated_at = form_updated_at;
    }
}