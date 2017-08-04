package com.san.postState;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class PostState {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String post_state;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp post_state_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp post_state_updated_at;

    public PostState() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPost_state() {
        return post_state;
    }

    public void setPost_state(String post_state) {
        this.post_state = post_state;
    }

    public Timestamp getPost_state_created_at() {
        return post_state_created_at;
    }

    public void setPost_state_created_at(Timestamp post_state_created_at) {
        this.post_state_created_at = post_state_created_at;
    }

    public Timestamp getPost_state_updated_at() {
        return post_state_updated_at;
    }

    public void setPost_state_updated_at(Timestamp post_state_updated_at) {
        this.post_state_updated_at = post_state_updated_at;
    }
}