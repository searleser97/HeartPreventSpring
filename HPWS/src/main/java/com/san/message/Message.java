package com.san.message;

import com.san.messageState.MessageState;
import com.san.relationship.Relationship;
import com.san.user.User;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Message {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Relationship relationship;
    private String message;
    @ManyToOne
    private User receiver;
    @ManyToOne
    private MessageState message_state;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp message_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp message_updated_at;

    public Message() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Relationship getRelationship() {
        return relationship;
    }

    public void setRelationship(Relationship relationship) {
        this.relationship = relationship;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public MessageState getMessage_state() {
        return message_state;
    }

    public void setMessage_state(MessageState message_state) {
        this.message_state = message_state;
    }

    public Timestamp getMessage_created_at() {
        return message_created_at;
    }

    public void setMessage_created_at(Timestamp message_created_at) {
        this.message_created_at = message_created_at;
    }

    public Timestamp getMessage_updated_at() {
        return message_updated_at;
    }

    public void setMessage_updated_at(Timestamp message_updated_at) {
        this.message_updated_at = message_updated_at;
    }
}