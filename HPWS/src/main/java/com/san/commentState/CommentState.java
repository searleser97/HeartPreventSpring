package com.san.commentState;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class CommentState {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String comment_state;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp comment_state_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp comment_state_updated_at;
    public CommentState() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComment_state() {
        return comment_state;
    }

    public void setComment_state(String comment_state) {
        this.comment_state = comment_state;
    }

    public Timestamp getComment_state_created_at() {
        return comment_state_created_at;
    }

    public void setComment_state_created_at(Timestamp comment_state_created_at) {
        this.comment_state_created_at = comment_state_created_at;
    }

    public Timestamp getComment_state_updated_at() {
        return comment_state_updated_at;
    }

    public void setComment_state_updated_at(Timestamp comment_state_updated_at) {
        this.comment_state_updated_at = comment_state_updated_at;
    }
}