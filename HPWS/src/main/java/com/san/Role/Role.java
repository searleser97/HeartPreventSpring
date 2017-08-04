package com.san.Role;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String role;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp role_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp role_updated_at;

    public Role(Integer id, String role, Timestamp role_created_at, Timestamp role_updated_at) {
        this.id = id;
        this.role = role;
        this.role_created_at = role_created_at;
        this.role_updated_at = role_updated_at;
    }

    public Role() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Timestamp getRole_created_at() {
        return role_created_at;
    }

    public void setRole_created_at(Timestamp role_created_at) {
        this.role_created_at = role_created_at;
    }

    public Timestamp getRole_updated_at() {
        return role_updated_at;
    }

    public void setRole_updated_at(Timestamp role_updated_at) {
        this.role_updated_at = role_updated_at;
    }
}