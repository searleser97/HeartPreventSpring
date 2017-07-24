package com.san.post;

import com.san.postState.PostState;
import com.san.postType.PostType;
import com.san.user.User;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Post {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String post;
    @ManyToOne
    private User user;
    @ManyToOne
    private PostType post_type;
    @ManyToOne
    private PostState post_state;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp post_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp post_updated_at;

    public Post() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public PostType getPost_type() {
        return post_type;
    }

    public void setPost_type(PostType post_type) {
        this.post_type = post_type;
    }

    public PostState getPost_state() {
        return post_state;
    }

    public void setPost_state(PostState post_state) {
        this.post_state = post_state;
    }

    public Timestamp getPost_created_at() {
        return post_created_at;
    }

    public void setPost_created_at(Timestamp post_created_at) {
        this.post_created_at = post_created_at;
    }

    public Timestamp getPost_updated_at() {
        return post_updated_at;
    }

    public void setPost_updated_at(Timestamp post_updated_at) {
        this.post_updated_at = post_updated_at;
    }
}