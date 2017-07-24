package com.san.comment;

import com.san.commentState.CommentState;
import com.san.post.Post;
import com.san.user.User;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Comment {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String comment;
    @ManyToOne
    private User user;
    @ManyToOne
    private Post post;
    @ManyToOne
    private CommentState comment_state;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp comment_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp comment_updated_at;

    public Comment() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public CommentState getComment_state() {
        return comment_state;
    }

    public void setComment_state(CommentState comment_state) {
        this.comment_state = comment_state;
    }

    public Timestamp getComment_created_at() {
        return comment_created_at;
    }

    public void setComment_created_at(Timestamp comment_created_at) {
        this.comment_created_at = comment_created_at;
    }

    public Timestamp getComment_updated_at() {
        return comment_updated_at;
    }

    public void setComment_updated_at(Timestamp comment_updated_at) {
        this.comment_updated_at = comment_updated_at;
    }
}