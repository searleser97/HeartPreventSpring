package com.san.postType;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class PostType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String post_type;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp post_type_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp post_type_updated_at;

    public PostType() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPost_type() {
        return post_type;
    }

    public void setPost_type(String post_type) {
        this.post_type = post_type;
    }

    public Timestamp getPost_type_created_at() {
        return post_type_created_at;
    }

    public void setPost_type_created_at(Timestamp post_type_created_at) {
        this.post_type_created_at = post_type_created_at;
    }

    public Timestamp getPost_type_updated_at() {
        return post_type_updated_at;
    }

    public void setPost_type_updated_at(Timestamp post_type_updated_at) {
        this.post_type_updated_at = post_type_updated_at;
    }
}